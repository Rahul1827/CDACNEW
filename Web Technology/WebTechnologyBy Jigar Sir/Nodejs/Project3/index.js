
const express = require("express");
const mongoose = require("mongoose");

const db= require('./database/db.js');
db();
console.log(db);

//mail code
const nodemailer = require("nodemailer");

const transporter = nodemailer.createTransport({
   service:"gmail",
    auth: {
      user: "rahul.patil.sbg@gmail.com",
      pass: "kzvo ipnr ktnh zopd",
    },
  });

  //mail code



const Schema = mongoose.Schema;
const userSchema = new Schema({

    name: String,
    email:String,
    MobileNo:Number,
});
const usermodel = mongoose.model("newusers", userSchema);


var app= express();
app.use(express.json());
app.use(express.urlencoded());

app.get('/add', function(request , response){
    response.render('addUser.ejs');
})


app.get('/show', async function(request , response){
    //response.render('showUser.ejs');

    try{
       var result = await usermodel.find();
       response.render('showUser.ejs',{data:result});

    }catch(eroor)
    {
       response.send(error.message);
    }
})

app.post("/useraction", async function(request, response){
   // console.log(request.body);

   try{
var record = new usermodel(request.body);
 await record.save();
 main(request.body.email);
 response.redirect("/show");
   }catch(error)
   {
response.send(error.message);
   }
    


});


async function main(emailid) {
    // send mail with defined transport object
    const info = await transporter.sendMail({
      from: '<rahul.patil.sbg@gmail.com>', // sender address
      to: emailid, // list of receivers
      subject: "Hello Beta ✔", // Subject line
      text: "Hello world?", // plain text body
      html: "<b>Hello world?</b>", // html body
    });
  
    console.log("Message sent: %s", info.messageId);
    // Message sent: <d786aa62-4e0a-070a-47ed-0b0666549519@ethereal.email>
  }

app.listen(9000);