var express= require("express");
var mongoose=require("mongoose");
var db=require("./database/db.js");
var app=express();
app.use(express.json());
console.log(db);
db();


const Schema = mongoose.Schema;
//const ObjectId = Schema.ObjectId;

const productSchema = new Schema({
  name: String,
  price: Number,
  discount: String
})

const productModel = mongoose.model("products", productSchema);

app.get("/products", async function(request,response){
    try{
           var result= await productModel.find();
           response.send(result);
           console.log("hii");
           
    }
    catch(error)
    {
        response.send(error.message);

    }
});


app.post("/products", async function (request, response) {
    // console.log(request.body);
  
    try {
      var record = new productModel(request.body);
      var ans = await record.save();
      response.send("Record Inserted");
    } catch (error) {
      response.send(error.message);
    }
  });
  
  app.put("/products", function (request, response) {
    response.send("Update data from database");
  });
  
  app.delete("/products", function (request, response) {
    response.send("delete data from database");
  });


app.listen(3000);