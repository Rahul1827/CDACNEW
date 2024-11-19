npm init -y   it is help to create package.json

 npm install express 

 C:\Program Files\MongoDB\Server\4.2\bin
 mongod.exe
 mongo.exe

 use userdetails

 db.createCollections('users')   ----create collection---
 There are three ways to insert records in database 
 1.insert()
 2.insertOne()
 3.insertMany()

<---------------Insert command---------------->
 db.users.insert([{"name" : "Rahul", "age" :24, "place": "Indore"}]);
  db.users.insert([{"name" : "Akshay", "age" :23, "place": "Pune"}]);
   db.users.insert([{"name" : "Lavesh", "age" :24, "place": "Delhi"}]);


   <--------installation command of mongoose----------> 

   npm i mongoose