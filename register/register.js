 "use strict"
//  DOM element Manipulations 
 const form=document.getElementById("form_controller");
 const firstnamecheck = document.querySelector(".first-span")
 const lastNameCheck = document.querySelector(".lastname-span")

 // regex expression for firstname
 const firstnamepattern = /^[a-zA-Z]{6,10}$/  
//  setting the GEOlocation API
if(navigator.geolocation)
    navigator.geolocation.getCurrentPosition(function(){
        console.log("Your Position has been dervied ")
    },function(){
        alert("Your position could not be derived")
    })
// setting event listeners 
 //adding prevent default to the form to prevent its default behavior
 //seting validation for the input fields in the form 
 //adding regex expression to the code 
form.addEventListener("submit",(e)=>{e.preventDefault()
    // regex expression for firstname
    if(firstnamepattern.test(form.firstname.value)){
       firstnamecheck.style.display = "none" 
    }
    else{
        firstnamecheck.style.display = "inline" 
    }
     //regex expression using ternary operator for the lastname value 
    firstnamepattern.test(form.inputLastName.value)? lastNameCheck.style.display = "none"  : lastNameCheck.style.display = "inline"
})








