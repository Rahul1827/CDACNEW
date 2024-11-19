import React, { useRef } from 'react'

export default function Login() {

    let x1=useRef();
    let x2=useRef();
    let x3=useRef();

    function f1(){
        // alert('clicked');
        // console.log(x1);
        // console.log(x2);
        // console.log(x1.current.value);
        // console.log(x2.current.value);
        // console.log(x3.current.value);

        var data ={
            name: x1.current.value,
            age: x2.current.value,
            place: x3.current.value
        }

       // console.log(data);
        data=JSON.stringify(data);
       // console.log(data);
        fetch("http://localhost:9000/users",{
            method: 'post', 
            body: data,
             headers: {'content-type': 'application/json'}
             
            }).then(function(result){
                console.log(result);
                

            }).catch(function(error){
                console.log(error);
                
            });
        
        
        
        
        
    }

  return (
    <div className="container">
        <h1>Login Form</h1>
        <input type="text" ref={x1} placeholder='Enter name'/> <br />
        <input type="text" ref={x2} placeholder='Enter age'/> <br />
        <input type="text" ref={x3} placeholder='Enter place'/> <br />
        <button onClick={f1}>Login</button>
        <p></p>
        <p></p>
    </div>
  )
}
