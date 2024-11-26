import React from "react";
import { createBrowserRouter,RouterProvider } from "react-router-dom";
import App from "./App";
import Popular from "./components/Popular";
import TopRated from "./components/TopRated";
import Upcoming from "./components/Upcoming";
import Search from "./components/Search";
import MovieDetails from "./components/MovieDetails";

const router = createBrowserRouter([
    {



        path: "/",
        element: <App/>,
        children:[
 
    
    {

        path:"/upcoming",
        element:<Upcoming/>
    },

    {

        path:"/popular",
        element:<Popular/>
    },

    {

        path:"/top",
        element:<TopRated/>
    },
    {

        path:"/search",
        element:<Search/>
    },

    {

        path:"/moviedetails",
        element:<MovieDetails/>
    }
],
},
])

export default router;