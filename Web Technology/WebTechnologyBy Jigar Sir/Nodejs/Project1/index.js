// console.log("Hello world");
// console.log("Hello Rahul");
// console.log("Hello Pushpa");
// console.log("Hello Pradeep");
// console.log("Hello Vasu");
// console.log("Hello Akshay");

var express = require("express");
var mongoose = require("mongoose");
var db = require("./database/db.js");
var cors=require("cors");
//Mysql

var mysql = require("mysql");
var connection = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "password",
  database: "bhushan",
});

//Mysql
var app = express();
app.use(cors());

//It is pouplate the incoming data
app.use(express.json());
console.log(db);
db();

const Schema = mongoose.Schema;
const ObjectId = Schema.ObjectId;

const userSchema = new Schema({
  name: String,
  age: Number,
  place: String,
});

const userModel = mongoose.model("users", userSchema);

//http://localhost:9000/users
app.get("/users", async function (request, response) {
  try {
    var result = await userModel.find();
    response.send(result);
  } catch (error) {
    response.send(error.message);
  }
});

app.post("/users", async function (request, response) {
  // console.log(request.body);

  try {
    var record = new userModel(request.body);
    var ans = await record.save();
    response.send("Record Inserted");
  } catch (error) {
    response.send(error.message);
  }
});

app.put("/users", function (request, response) {
  response.send("Update data from database");
});

app.delete("/users", function (request, response) {
  response.send("delete data from database");
});

//Mysql
app.get("/userinfo", function (request, response) {
  connection.query("select * from emp", function (error, result) {
    if (error) response.send(error.message);
    else response.send(result);
  });
});

app.post("/userinfo", function (request, response) {
  console.log(request.body);
  connection.query(
    "insert into emp set ?",
    request.body,
    function (error, result) {
      if (error) {
        response.send(error.message);
      } else {
        response.send("User added successfully");
      }
    }
  );
});

//Mysql

app.listen(9000);
