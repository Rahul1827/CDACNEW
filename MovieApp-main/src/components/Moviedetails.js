import axios from "axios";
import React, { useEffect, useState } from "react";
import { useSearchParams } from "react-router-dom";

export default function Moviedetails() {
  const [searchParams] = useSearchParams();
  const id = searchParams.get("q");
  const apikey = "c45a857c193f6302f2b5061c3b85e743";

  const [movies, setMovies] = useState(null);
  const [cast, setCast] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  const fetchMovie = async () => {
    try {
      const res = await axios.get(
        `https://api.themoviedb.org/3/movie/${id}?api_key=${apikey}&language=en-US`
      );
      setMovies(res.data);
      setLoading(false);
    } catch (err) {
      setError("Error fetching movie details");
      setLoading(false);
    }
  };

  const fetchMovieCast = async () => {
    try {
      const res = await axios.get(
        `https://api.themoviedb.org/3/movie/${id}/credits?api_key=${apikey}&language=en-US`
      );
      setCast(res.data.cast); // All cast data
    } catch (err) {
      console.log("Error fetching cast data", err);
    }
  };

  useEffect(() => {
    fetchMovie();
    fetchMovieCast();
  }, [id]);

  if (loading) {
    return <div>Loading...</div>;
  }

  if (error) {
    return <div>{error}</div>;
  }

  return (
    <div className="container">
      {/* All content inside a single div */}
      <div className="row mb-4">
        {/* Movie Poster */}
        <div className="col-md-4 mb-3">
          {movies.poster_path && (
            <img
              src={`https://image.tmdb.org/t/p/w500${movies.poster_path}`}
              alt={movies.title}
              className="img-fluid"
              style={{ maxHeight: "400px", objectFit: "contain" }}
            />
          )}
        </div>

        {/* Movie Details */}
        <div className="col-md-4 mb-3">
          <h3>{movies.title}</h3>
          <p><strong>Rating:</strong> {movies.vote_average}</p>
          <p><strong>Runtime:</strong> {movies.runtime} Mins</p>
          <p><strong>Genres:</strong> {movies.genres && movies.genres.map((gen) => gen.name).join(", ")}</p>
          <p><strong>Release Date:</strong> {movies.release_date}</p>
          <div>
            <h5>Overview</h5>
            <p>{movies.overview}</p>
          </div>
        </div>

        {/* Backdrop Image */}
        <div className="col-md-4 mb-3">
          {movies.backdrop_path && (
            <img
              src={`https://image.tmdb.org/t/p/w500${movies.backdrop_path}`}
              alt={movies.title}
              className="img-fluid"
              style={{ maxHeight: "400px", objectFit: "cover" }}
            />
          )}
        </div>
      </div>

      {/* Cast Section */}
      <div>
        <h4>Cast</h4>
        <div className="row">
          {cast && cast.length > 0 ? (
            cast.map((actor) => (
              <div key={actor.cast_id} className="col-6 col-sm-4 col-md-3 col-lg-2 mb-4">
                <div className="card" style={{ width: "100%" }}>
                  {actor.profile_path ? (
                    <img
                      src={`https://image.tmdb.org/t/p/w500${actor.profile_path}`}
                      alt={actor.name}
                      className="card-img-top"
                      style={{ height: "200px", objectFit: "cover" }}
                    />
                  ) : (
                    <div
                      className="card-img-top"
                      style={{
                        height: "200px",
                        backgroundColor: "#ccc",
                        display: "flex",
                        justifyContent: "center",
                        alignItems: "center",
                        color: "#fff",
                      }}
                    >
                      No Image
                    </div>
                  )}
                  <div className="card-body text-center">
                    <h5 className="card-title" style={{ fontSize: "14px" }}>
                      {actor.name}
                    </h5>
                    <p className="card-text" style={{ fontSize: "12px" }}>
                      {actor.character}
                    </p>
                  </div>
                </div>
              </div>
            ))
          ) : (
            <p>No cast information available.</p>
          )}
        </div>
      </div>
    </div>
  );
}
