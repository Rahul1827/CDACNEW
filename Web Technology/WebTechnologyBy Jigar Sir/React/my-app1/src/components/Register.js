import React, { useEffect, useState } from 'react'

export default function Register() {
 var[count,setcount ]= useState(100);
 var[name,setname]=useState("Rahul");
 //when  you visit the component useEffect hook get called.
 //if their is change in state variable then useEffect hook be called.
//  useEffect(()=>{

//     console.log('useEffect called',count, name);
    
//  })
//These useEffect hooks with empty array then it is called only ones.

// useEffect(()=>{

//     console.log('useEffect called',count, name);
    
//  },[])
//These useEffect hooks use with conditional variable.
// useEffect(()=>{

//     console.log('useEffect called',count, name);
    
//  },[name])

useEffect(()=>{

    console.log('useEffect called',count, name);
    return () =>{
        console.log("I am Leaving");
        
    }
    
 },[])


 function f1(){
    //alert('Clicked');
    setcount(count+1);
 }
 function f2(){
    setname("Akshay");

    
 }
  return (
<div className="container">

    <h1>State Variable</h1>
    <p>{count}</p>
    <button onClick={f1}>Register</button>
    <p>{name}</p>
    <button onClick={f2}>Submit</button>
</div>


  )
}
