import React, { useEffect, useState } from 'react';
import axios from 'axios';

export default function Product1() {
  const [record, setRecord] = useState([]);

  useEffect(() => {
    // Fetch data from API
    axios.get('https://fakestoreapi.com/products')
      .then((response) => {
        console.log(response.data);
        setRecord(response.data);
      })
      .catch((error) => {
        console.error('Error fetching data:', error);
      });
  }, []);

  return (
    <div className="container">
      <div className="row">
        {record && record.length > 0 && 
        record.map((val) => (<div className="col-3" >

            <img src={val.image} alt="" className='img-fluid' />
           <h2>{val.price}</h2>
           <p>{val.title}</p>
          </div>
        ))}
      </div>
    </div>
  );
}
