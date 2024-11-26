import React from 'react';
import ReactDOM from 'react-dom/client';
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.min.js";
import './index.css';
import App from './App.js';
import { RouterProvider } from 'react-router-dom';
import router from './routing.js';
import store from './store/store.js';

import {Provider} from 'react-redux' 


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  
    // <RouterProvider router={router} />
    <Provider store={store}>
    <RouterProvider router={router}/>
    </Provider>
  
);

