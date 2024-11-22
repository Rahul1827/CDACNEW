import { configureStore } from "@reduxjs/toolkit";
// import counterReducer from '../features/counter/counterSlice'
import cartReducer from "./Slices/cartSlice"
import  categoryReducer  from "./Slices/categorySlice";

const projectStore = configureStore({
  reducer: {
    category:categoryReducer,
    cart:cartReducer,
  },
});

export default projectStore;
