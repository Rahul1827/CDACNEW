
import { Outlet } from 'react-router-dom';
import './App.css';
import Footer from './components/Footer';
import Header from './components/Header';
import React from 'react';


function App() {
  return (
   <>
   
   <Header/>
   <Outlet/>
   <Footer/>
   </>
  );
}

export default App;
