import axios from 'axios';
import React, { useEffect } from 'react'

const Upcoming = () => {

    
   // https://api.themoviedb.org/3/movie/upcoming?api_key=${Api_key}&language=en-US&page=1
   const Api_key="c45a857c193f6302f2b5061c3b85e743";

   const fetchUpcomingMovies =()=>{
axios.get(` https://api.themoviedb.org/3/movie/popular?api_key=${Api_key}&language=en-US&page=1`)
.then((Response)=>{
    console.log(Response);
    
}).catch((error)=>
{
    console.log(error);
    
})
   }
useEffect(()=>
{ fetchUpcomingMovies();

},[])
  return (
    <div>
      Upcoming
    </div>
  )
}

export default Upcoming
