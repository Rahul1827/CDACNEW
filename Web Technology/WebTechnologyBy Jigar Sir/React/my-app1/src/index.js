import React from 'react';
import './css/style.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import ReactDom from "react-dom";
import { Outlet ,Link} from 'react-router-dom';
// console.log(React);
//console.log(ReactDom);
import App from './components/App';
import projectrout from './projectrout';

import { createBrowserRouter, RouterProvider } from 'react-router-dom';

const result =ReactDom.createRoot(document.getElementById("root"));
//result.render("Hello World!...");

// var username ="Rahul";
// var age=23;

// result.render(
//     <ul>
//         <li>{username}</li>
//         <li>{age}</li>
//     </ul>
// )

//result.render(<App/>)

result.render(<RouterProvider router={projectrout}/>);
