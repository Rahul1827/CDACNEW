import {
    createBrowserRouter,
    RouterProvider,
  } from "react-router-dom";

import Home from "./components/Home";
import Login from "./components/Login";
import Register from "./components/Register";
import Content from "./components/Content";
import App from "./components/App";
import Product1 from "./components/Product1";

  const projectrout=createBrowserRouter([
    {
        path:"",
        element:<App/>,
        children:[

            {
                path:"",
                element:<Home/>
             },
            {
                path:"loginpage",
                element:<Login/>
             },
             {
            
                path:"registerpage",
                element:<Register/>
             },
             {
                path: "contentpage",
                element:<Content/>
             },

             {
                path: "productpage",
                element:<Product1/>
             }


        ]
    },
 
  ]);

  export default projectrout