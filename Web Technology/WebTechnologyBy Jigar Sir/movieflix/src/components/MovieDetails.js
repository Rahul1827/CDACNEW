import axios from "axios";
import React, { useEffect, useState } from "react";
import { useSearchParams } from "react-router-dom";

export default function Moviedetails() {
  const [searchParams] = useSearchParams();
  const id = searchParams.get("q");
  console.log(id);
  const apikey = `c45a857c193f6302f2b5061c3b85e743`;
  const [movies, setData] = useState([]);

  const fetchMovie = async () => {
    try {
      var res = await axios.get(
        `https://api.themoviedb.org/3/movie/${id}?api_key=${apikey}&language=en-US`
      );
      console.log(res.data);
      setData(res.data);
    } catch (err) {
      console.log(err);
    }
  };

  useEffect(() => {
    fetchMovie();
  }, []);

  return (
    <>
      <div className="container">
        <div className="row">
          <div className="col-xl-6"></div>
          <div className="col-xl-6">
            <img
              src={`https://image.tmdb.org/t/p/w500${movies.backdrop_path}`}
              alt=""
              className="img-fluid"
            />
          </div>
        </div>
      </div>
    </>
  );
}
