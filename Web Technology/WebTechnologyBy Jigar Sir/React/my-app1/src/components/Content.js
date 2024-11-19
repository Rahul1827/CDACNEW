import React from 'react';
import Product from "./Product";
function Content (){

    return (
        <div className="container">
            <div className="row">
            <div className="col-xl-3"><Product name ="Wrogen" price ="1999"/></div>
            <div className="col-xl-3"><Product name ="Nike" price ="1899"/></div>
            <div className="col-xl-3"><Product name ="adidas" price ="1919"/></div>
            <div className="col-xl-3"><Product name ="Puma" price ="1999"/></div>
            
            </div>
        </div>
    )
    
}  

export default Content;