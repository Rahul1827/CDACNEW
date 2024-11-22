import React from 'react';
import './css/style.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import ReactDom from "react-dom";
import { Outlet ,Link} from 'react-router-dom';
// console.log(React);
//console.log(ReactDom);
import App from './components/App';
import projectrout from './projectrout';
import { Provider } from 'react-redux'

import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import projectStore from './Redux/projectStore';

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

result.render(
<Provider store={projectStore}>
<RouterProvider router={projectrout}/>);
</Provider>)