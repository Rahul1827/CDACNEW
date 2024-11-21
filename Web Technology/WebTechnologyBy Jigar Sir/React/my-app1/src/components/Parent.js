import React, { useState } from 'react'
import Left from './Left'
import Right from './Right'

export default function Parent() {

    var[Category,setcategory]=useState();
function parentFun(data)
{
    console.log("Parent function called", data);
    setcategory(data);
    
}

  return (
  <div className="container">
    <h1>State lift example,{Category}</h1>
    <div className="row">
        <div className='col-3'><Left p1={parentFun}/>
       
        </div>
 
        <div className='col-9'>
        <Right p2={Category}/>
        </div>
        
    </div>
  </div>

  )
}
