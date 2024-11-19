var fs=require('fs');

var http= require("http");
const server=http.createServer(function(request, response){

fs.readFile('index.html', 'UTF-8',function(error, data){
response.end(data);
});
});
server.listen(9065);