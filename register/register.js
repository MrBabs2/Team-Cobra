 "use strict"
//  DOM element Manipulations 
 const firstname = document.getElementById("firstname");
 const form=document.getElementsByTagName("form");

//  setting the GEOlocation API

if(navigator.geolocation)
    navigator.geolocation.getCurrentPosition(function(){
        console.log("I am working")
    },function(){
        alert("Your position could not be derived")
    })


    // setting event listeners 


    //adding prevent default to the form to prevent its default behavior
form.addEventListener("submit",(e)=>{e.preventDefault()})





