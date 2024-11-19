//Custom server
var http= require('http');
//console.log(http);

const server=http.createServer(function(request,response){
    console.log(typeof request, typeof response);
    //response.end("Hello, world!");
    response.end("Good Morning");
    
});

server.listen(9000);

