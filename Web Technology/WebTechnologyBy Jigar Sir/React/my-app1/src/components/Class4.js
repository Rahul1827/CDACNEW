import React, { Component } from "react";

export default class Class4 extends Component {
  constructor() {
    super();
    this.state = {
      apiData: [],
    };
  }

  componentDidMount() {
    fetch("http://localhost:9000/users")
      .then((res) => res.json())
      .then((value) => {
        console.log(value);
        // setdata(value);
        this.setState({ apiData: value });
      });
  }
  render() {
    var result = this.state.apiData;
    return (
      <div className="container">
        <h1>Fetch Data From Node.js</h1>

        <table class="table">
          <thead>
            <tr>
              <th scope="col">Name</th>
              <th scope="col">Age</th>
              <th scope="col">Place</th>
            </tr>

            {result &&
              result.length > 0 &&
              result.map((value) => (
                <tr>
                  <td>{value.name}</td>
                  <td>{value.age}</td>
                  <td>{value.place}</td>
                </tr>
              ))}
          </thead>
        </table>
      </div>
    );
  }
}
