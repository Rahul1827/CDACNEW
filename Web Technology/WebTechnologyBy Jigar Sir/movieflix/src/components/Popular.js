import axios from 'axios';
import React, { useEffect, useState } from 'react'
import './popular.css';
import { useSelector } from 'react-redux';
import { useNavigate } from 'react-router-dom';

const Popular = () => {

    const [movies, setMovies] =useState([]);
    const [page,setPage] = useState(1);

    const navigate = useNavigate();

   // https://api.themoviedb.org/3/movie/popular?api_key=${Api_key}&language=en-US&page=${page}
   const Api_key="c45a857c193f6302f2b5061c3b85e743";
   const movie_name =useSelector((state)=>state.search.value);
   console.log(movie_name);
   

   const fetchPopularMovies =(page)=>{
    

    



axios.get(` https://api.themoviedb.org/3/movie/popular?api_key=${Api_key}&language=en-US&page=${page}`)
.then((Response)=>{
    console.log(Response.data.results);
    setMovies(Response.data.results)
    
}).catch((error)=>
{
    console.log(error);
    
})
   }

   const handlePre =()=>{

    if(page>1)
    {
        setPage(page-1);
        window.scroll(0,0);
    }
}

const handleNext = ()=>{

   
        setPage(page+1);
        window.scroll(0,0);
    
}

const handleMovie=(id)=>{

    console.log(id);
    navigate(`/moviedetails?q=${id}`);
    
}

   useEffect(()=>
{ 
    fetchPopularMovies(page);

},[page])
  return (
    <>
    <div className="container1">
        <div className="row">


            {
            movies && movies.length > 0 && movies.map((movie)=> {
             return(
                <div className='col-xl-3 text-center p-3 single' onClick={()=>handleMovie(movie.id)}>

                    <img src={`https://image.tmdb.org/t/p/w500${movie.poster_path}`} alt="" className='img-fluid'/>
                    <h4>movie.title</h4>
                    <p>Rating: <strong>{movie.vote_average}</strong></p>
                </div>
             )


            }
            
            )}
        </div>

        {movies.length >0 && <div className='pagination'>
            <button onClick={handlePre} className='btn btn-danger'>Previous</button>
            <button   className='btn btn-danger'>{page}</button>
            <button  onClick={handleNext} className='btn btn-danger'>Next</button>
            
            </div>}
    </div>
    </>
  )
}

export default Popular
