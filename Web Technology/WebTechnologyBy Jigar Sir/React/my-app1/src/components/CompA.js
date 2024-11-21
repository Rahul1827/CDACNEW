import React, { useRef, useState } from "react";
import CompB from "./CompB";
import CompC from "./CompC";
import contextAPI from "../contextAPI";

export default function CompA() {

    var[data,setData]=useState();
    var x1=useRef();

 function f1()
{
    console.log(x1.current.value);
    setData(x1.current.value);
    
}

  return (
    <div className="container">
      <h1>Search</h1>
      <input type="text" placeholder="Enter Category" ref={x1}/>
      <button onClick={f1}>Search</button>
      {data}
<contextAPI.Provider value={data}>
      <CompB p1={data} />
      </contextAPI.Provider>

      
    </div>
  );
}
