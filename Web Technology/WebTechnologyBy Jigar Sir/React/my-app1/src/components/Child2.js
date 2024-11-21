import React from 'react'

export default function Child2(props) {

    if(props.p1=="")
        {
            throw new Error("Image not found");
        }
    
  return (
    <div>
      <img src={props.p1} alt="" className='img-fluid'/>
    </div>
  )
}
