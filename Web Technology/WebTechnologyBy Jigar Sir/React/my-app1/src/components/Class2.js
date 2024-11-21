import React from "react";
import { json } from "react-router-dom";

class Class2 extends React.Component
{

constructor(){

    super();

 this.x1=React.createRef();
 this.x2=React.createRef();
 this.x3=React.createRef();
}

f1()
{
    // console.log(this.x1);
    // console.log(this.x1.current.value);
    var data={
        name: this.x1.current.value,
        age: this.x2.current.value,
        place: this.x3.current.value,
    }
    data=JSON.stringify(data);
    console.log(data);

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

    render()
    {
return(

    <div className="container">
    <h1>Reference Variables</h1>
    <input type="text" ref={this.x1} placeholder="Enter Name"/><br/>
    <input type="text" ref={this.x2} placeholder="Enter Age"/> <br/>
    <input type="text" ref={this.x3} placeholder="Enter Place"/> <br/>
    <button onClick={()=>{this.f1()}}>Submit</button>
</div>

)
      
    }
}

export default Class2;