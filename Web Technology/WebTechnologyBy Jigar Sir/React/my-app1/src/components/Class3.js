import React from "react";

class Class3 extends React.Component {
  constructor() {
    super();
    console.log(this);

    this.state={
        name:"Rahul",
        age:24,

    }
  }


f1()
{
    this.setState({
        name:"Divya"
    });
}

f2()
{
    this.setState({
       age: this.state.age +1,
    })
}
// componentDidMount Cycle it will be called once only on mounting.
componentDidMount()
{
    console.log("Did Mount Cylce Called" ,this.state.name, this.state.age);
    
}
//Did Update cycle called on every change 
componentDidUpdate()
{
    console.log("Did Update Cylce Called" ,this.state.name, this.state.age);

}
//All garbage collection process done by Component will Unmount method
componentWillUnmount()
{
    console.log("Leaving Component!");
}


  render() {
    return (
      <div className="container">
        <h1>Life Cycle Hook</h1>
        <p>{this.state.name}</p>
        <button onClick={()=>{this.f1()}}>Change Name</button>
        <p>{this.state.age}</p>
        <button onClick={()=>{this.f2()}}>Change Age</button>
      </div>
    );
  }
}

export default Class3;
