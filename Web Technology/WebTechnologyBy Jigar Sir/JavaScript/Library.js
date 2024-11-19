"use strict";

class Auth {
  constructor() {
    this.details = [
      {
        email: "abc@gmail.com",
        password: "Abc@123",
      },
      {
        email: "def@gmail.com",
        password: "Def@123",
      },
      {
        email: "ghi@gmail.com",
        password: "Ghi@123",
      },

      {
        email: "jkl@gmail.com",
        password: "Jkl@123",
      },
      {
        email: "mno@gmail.com",
        password: "Mno@123",
      },
    ];
  }

checkEmail(emailId)
{
var exp4=/^([a-zA-Z0-9\.]+)@([a-zA-Z0-9]+)\.([a-zA-Z]{2,})(\.[a-zA-Z]{2,}])?$/

var result=exp4.test(emailId);
return result;

}

checkPassword(pwd)
{
 var exp5= /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#/$]).{4,12}$/
 var result=exp5.test(pwd);
 return result;
}
checkEmailAndPassword()
{

}

}

export default Auth;
