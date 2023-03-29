 "use strict"
//  DOM element Manipulations 
 const form=document.getElementById("form_controller");
 const firstnamecheck = document.querySelector(".first-span");
 const lastNameCheck = document.querySelector(".lastname-span");
 const emailCheck = document.querySelector(".email-span");
 const phonenumber = document.querySelector(".number-span");
 const studentNumberSelector = document.querySelector(".studentnumber-span");
 const dateOfBirthChecker = document.querySelector(".dateofbirth-span");
 const firstPasswordLength = document.querySelector(".studentpassword-span");
 const secondPasswordlength =document.querySelector(".studentsecondpassword-span")
 const passwordconfirmer = document.querySelector(".studentmain-span")

 // regex tester for firstname and lastname
 const firstnamepattern = /^[a-zA-Z]{1,}$/ 
 // regex tester for email 
 const emailchecker = /^.{4,}$/
//regex tester for phone number
const phonenumberchecker = /^[0-9]{6,}$/ 
//regex tester for studentnumber 
const studentNumber = /^[0-9]{0,8}$/ 
//regex testerfor date of birth
const DOB = /^.{1,12}$/ 
//regex tester for password 
const firstPassword = /^.{1,}$/
//regex tester for confirmingpassword 
const secondpasswordChecker = /^.{1,}$/





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
     //regex expression using ternary operator for the 
     
    //  regex expression for lastname value 
    firstnamepattern.test(form.inputLastName.value)? lastNameCheck.style.display = "none"  : lastNameCheck.style.display = "inline"
    //regex expression for testing emails
    emailchecker.test(form.inputemail.value)?emailCheck.style.display="none":emailCheck.style.display="inline"
    //regex expression for phone number
    phonenumberchecker.test(Number(form.inputPhonenumber.value))? phonenumber.style.display = "none": phonenumber.style.display ="inline"
    //regex expression for testing student number 
    studentNumber.test(form.inputStudentIDnumber.value) ? studentNumberSelector.style.display = "none" :studentNumberSelector.style.display = "inline" 
    //regex expression for Date of Birth 
    DOB.test(form.inputdateofbirth.value)? dateOfBirthChecker.style.display ="none": dateOfBirthChecker.style.display ="inline"
    //regex expression for first and second password 
    firstPassword.test(form.inputfirstpassword.value) ? firstPasswordLength.style.display = "none": firstPasswordLength.style.display = "inline"
    // for testing the password length 
    secondpasswordChecker.test(form.inputconfirmpassword.value) ? secondPasswordlength.style.display = "none": secondPasswordlength.style.display = "inline"
    //testing for confirming both first and second password 
    form.inputfirstpassword.value !== form.inputconfirmpassword.value ? passwordconfirmer.style.display = "inline":passwordconfirmer.style.display = "none"
})



//setting of data from the user input for local storage 
const localFirstName= form.firstname.value.trim();  
const localSecondName =form.inputLastName.value.trim();
const localEmail = form.inputemail.value.trim()
const localStudentIdNumber = form.inputStudentIDnumber.value.trim()
const localfirstpassword = form.inputfirstpassword.value.trim()
const localsecondpasssword = form.inputconfirmpassword.value.trim()

//setting up local storage using local storage API 
//setting up the object for obtaining data from users 
 let userInput = {
    "firstname":localFirstName,
    "secondname": localSecondName,
    "email":localEmail,
    "student Number":localStudentIdNumber,
    "firstpassword":localfirstpassword,
    "secondpassword":localsecondpasssword
 }

 //stringify the localstorage API data to store in browser
 let inputs = JSON.stringify(userInput)

 //using the localstorage function to setItems in the local storage 
function settingLocalStorage(){
    return localStorage.setItem("itemsStr", inputs)
}

// using conditional statements to set local storage 
settingLocalStorage()








