import { createSlice } from '@reduxjs/toolkit'
const initialState = {
    value: [],
  }

  export const cartSlice = createSlice({
    name: 'cart',
    initialState,
    reducers: {

        addInCart:(state,action)=>{
            console.log("addInCart called");
            console.log(action.payload);
            state.value.push(action.payload);
            
            
        },


        removeFromCart:(state,action)=>{
            console.log("removeFromCart called");
            console.log(action.payload);
            var result =   state.value.filter(obj=>obj.id!=action.payload.id);
            console.log(result);
            state.value=result;
            
          
            
            
        }
      
    },
  })
  
  // Action creators are generated for each case reducer function
  export const {addInCart ,removeFromCart } = cartSlice.actions
  
  export default cartSlice.reducer
  