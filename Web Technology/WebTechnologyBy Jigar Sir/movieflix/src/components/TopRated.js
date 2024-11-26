import axios from 'axios';
import React, { useEffect } from 'react'

const TopRated = () => {
    
   // https://api.themoviedb.org/3/movie/popular?api_key=${Api_key}&language=en-US&page=1
   const Api_key="c45a857c193f6302f2b5061c3b85e743";

   const fetchTopRatedMovies =()=>{
axios.get(` https://api.themoviedb.org/3/movie/top?api_key=${Api_key}&language=en-US&page=1`)
.then((Response)=>{
    console.log(Response);
    
}).catch((error)=>
{
    console.log(error);
    
})
   }
   useEffect(()=>
{ fetchTopRatedMovies();

},[])
  return (
    <div>
      TopRated
    </div>
  )
}

export default TopRated
