import React, { useRef } from 'react'
import { Link, useNavigate } from 'react-router-dom'
import logo from '../assets/MovieFlixLogo.png';
import './Header.css';
import { useDispatch } from 'react-redux';
import { getSearchQuery } from '../store/slices/searchSlice';

export default function () {
    const title =useRef();
    const dispatch =useDispatch();
    const navigate = useNavigate();

    const handleSearch=(e)=>{
        e.preventDefault();

        console.log(title.current.value);
        dispatch(getSearchQuery(title.current.value));
        navigate('/search')
        
        
    }






  return (
    // <div className='container'>


<nav className="navbar navbar-expand-lg container">
          <div className="container-fluid">
            <Link className="navbar-brand" to="/">
              <img src={logo} alt=""  className="image"/>
            </Link>
            <button
              className="navbar-toggler"
              type="button"
              data-bs-toggle="collapse"
              data-bs-target="#navbarSupportedContent"
              aria-controls="navbarSupportedContent"
              aria-expanded="false"
              aria-label="Toggle navigation"
            >
              <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarSupportedContent">
              <ul className="navbar-nav me-auto mb-2 mb-lg-0 menus">
               
                <li className="nav-item">
                  <Link className="nav-link active" aria-current="page" to="/popular">
                    Popular
                  </Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link active" aria-current="page" to="/upcoming">
                    Upcoming
                  </Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link active" aria-current="page" to="/top">
                    Top-rated
                  </Link>
                </li>
              </ul>
              <form className="d-flex" role="search" >
                <input
                  className="form-control me-2"
                  type="search"
                  placeholder="Search"
                  aria-label="Search" ref={title}
                />
                <button className="btn btn-outline-success" type="submit" onClick={handleSearch}>
                  Search
                </button>
              </form>
            </div>
          </div>
        </nav>

    // </div>
  )
}
