// Named function

function sayHello(name)
{
    console.log(`Hello ${name}`);
}

sayHello("Rahul");


//Anonymous Function

var myFunc =function()
{
    console.log("RAHUL");
    
}
myFunc();

// Arrow Function

const great=() =>{console.log("Good Morning"), console.log("Hi")};

great();

//Array

const marvHeros= ["Iron Man" , "Thor" , "Captain America", "Black Widow"];
 const dcHeros = new Array("Super man", "Wonder Woman" , "Flash");

 var cap= marvHeros[2];
 for (let i=0; i< marvHeros.length;i++)
 {

    console.log(marvHeros[i]);
 
 }

 for (let hero of marvHeros)
 {
    console.log(hero);
    
 }

 for (let hero in marvHeros)
    {
       console.log(hero);
       
    }

    marvHeros.forEach ((hero, i) =>console.log(hero,i));

    const dcHeros1=["Super man","Wonder women", "Flash"];
    //dcHeros1.unshift("Bat man");

//     console.log(dcHeros1);
//    dcHeros1.shift();
//     console.log(dcHeros1);


const numbers = Array.from({ length: 10 }, (_, index) => index + 1);
const squares = numbers.map(num => num * num);

console.log("Numbers: ", numbers);
console.log("Squares: ", squares);

    
    
// const words = ["Hell
o", "World", "JavaScript", "Array", "Map"];

// const lowerCaseWords = words.map(word => word.toLowerCase());
// const upperCaseWords = words.map(word => word.toUpperCase());
// //const concat = words.map(word => word.toUpperCase().concat(lowerCaseWords));
// const Reverse = words.map(word => word.toUpperCase().Reverse(upperCaseWords));

// console.log("Lowercase Words: ", lowerCaseWords);
// console.log("Uppercase Words: ", upperCaseWords);
// console.log("concats Words: ", concat);
// console.log("Reverse Words: ", Reverse);

//Array of object

let users =[
{
id :1,
name:"Rahul",
age:24,
Physics:77,
chemistry:85,
Maths :90
},

{
    id :2,
    name:"Akshay",
    age:24,
    Physics:74,
    chemistry:75,
    Maths :80
    },

    {
        id :3,
        name:"Vasu",
        age:24,
        Physics:78,
        chemistry:75,
        Maths :82
        },
        
        {
            id :4,
            name:"Gaurav",
            age:24,
            Physics:78,
            chemistry:87,
            Maths :70
            },
            {
                id :5,
                name:"Vineet",
                age:24,
                Physics:87,
                chemistry:85,
                Maths :90
                }

]



var per = users.map((user) => {
    percentage =((user.Physics+user.chemistry+user.Maths)/300)*100;
    return user.name+"Percentage:" +percentage;
})
console.log(per);




