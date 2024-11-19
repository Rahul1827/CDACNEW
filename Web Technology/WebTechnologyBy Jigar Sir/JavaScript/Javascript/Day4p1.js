"use strict";
var category = ["Electronics", "Clothing", "Books", "Home & Garden"];

var Products = [
  {
    name: "t-shirt",
    price: 5000,
    path: "https://wrogn.com/cdn/shop/files/T-SHIRT_1.jpg?v=1729579393&width=360",
  },

  {
    name: "t-shirt",
    price: 4000,
    path: "https://wrogn.com/cdn/shop/files/1_37052daa-b1e4-42c1-93a4-0aae8ac38265.jpg?v=1726403759&width=360",
  },
  {
    name: "t-shirt",
    price: 3000,
    path: "https://wrogn.com/cdn/shop/files/1_35716b3c-8057-4afa-81a2-3b3af5160059.jpg?v=1726405000&width=360",
  },

  {
    name: "t-shirt",
    price: 2000,
    path: "https://wrogn.com/cdn/shop/files/1_31b1b5f3-0c86-44ad-a7ea-4ad127a4fbd6.jpg?v=1726403477&width=360",
  },
];

// short curcuit for sorting

category &&
  category.length > 0 &&
  category.forEach(function (v, i) {
    console.log(v, i);

    var listtag = document.createElement("li");
    console.log(listtag);

    listtag.innerHTML = v;

    document.querySelector("ul").append(listtag);
  });

Products &&
  Products.length > 0 &&
  Products.forEach(function (v, i) {
    console.log(v, i);

    var divtag = document.createElement("div");
    console.log(divtag);

    divtag.className = "col-xl-4 text-center";

    var imgtag = document.createElement("img");
    var h2tag = document.createElement("h2");
    var ptag = document.createElement("p");

    imgtag.src = v.path;
    imgtag.className = "img-fluid";
    h2tag.innerHTML = v.price;
    ptag.innerHTML = v.name;

    divtag.append(imgtag, h2tag, ptag);

    document.getElementById("row").append(divtag);
  });
