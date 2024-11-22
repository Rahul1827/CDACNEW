import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { removeFromCart } from "../Redux/Slices/cartSlice";
//import { toHaveValue } from "@testing-library/jest-dom/dist/matchers";

export default function Cart() {
  var ans = useSelector((state) => state.cart.value);
  console.log(ans);
  let dispatch = useDispatch();

  function removedata(value) {
    dispatch(removeFromCart(value));
  }

  return (
    <div className="container">
      <h1>Cart Data</h1>
      <div className="row">
        {ans &&
          ans.length > 0 &&
          ans.map((value) => (
            <div className="col-3">
              <img src={value.image} alt="" className="img-fluid" />
              <h2>{value.price}</h2>
              <p>{value.title}</p>
              <button
                onClick={() => {
                  removedata(value);
                }}
              >
                Remove
              </button>
            </div>
          ))}
      </div>
    </div>
  );
}
