var fs= require('fs');

console.log("start");

fs.readFile('index.html' , 'utf-8',function(error,data){
    console.log(data);
    

})
console.log("end");

