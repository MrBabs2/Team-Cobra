 "use strict"
 localStorage.clear()

 //firbase configurations 

import {initializeApp} from "firebase/app";
import {
    getFirestore,collection,serverTimestamp,getDocs,addDoc
} from "firebase/firestore"


//firebase configuration 
const firebaseConfig = {
    apiKey: "AIzaSyBVzo4WlJRzj8cst17QKeK1lRa1HmFUZrQ",
    authDomain: "cobralms.firebaseapp.com",
    projectId: "cobralms",
    storageBucket: "cobralms.appspot.com",
    messagingSenderId: "847322060158",
    appId: "1:847322060158:web:2323dd6db3cbf7f85c4f2f"
  };

//initializing firebase 
initializeApp(firebaseConfig)


//init services 
const db = getFirestore()

//collection reference 
const colRef = collection(db, "users") 




//  setting the GEOlocation API
if(navigator.geolocation)
navigator.geolocation.getCurrentPosition(function(){
    console.log("Your Position has been dervied ")
},function(){
    alert("Your position could not be derived")
})


//  DOM element Manipulations 
 const form=document.getElementById("form_controller");
 const firstnamecheck = document.querySelector(".first-span");
 const lastNameCheck = document.querySelector(".lastname-span");
 const emailCheck = document.querySelector(".email-span");
 const phonenumber = document.querySelector(".number-span");
 const studentNumberSelector = document.querySelector(".studentnumber-span");
 const dateOfBirthChecker = document.querySelector(".dateofbirth-span");
 const firstPasswordLength = document.querySelector(".studentpassword-span");
 const secondPasswordlength =document.querySelector(".studentsecondpassword-span");
 const passwordconfirmer = document.querySelector(".studentmain-span");
 const googlesignIn = document.querySelector(".g-signin2");
 const terms = document.querySelector(".terms");
 const popUp = document.querySelector(".popup-wrapper");
 const popClose = document.querySelector(".popup-close")
//  console.log(form.children)
// const changeArray= Array.from(form)
// console.log(changeArray)

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

function TestRegexPatterns(){
// regex expression for firstname
     //regex expression using ternary operator for the 
     firstnamepattern.test(form.firstname.value) ?  firstnamecheck.style.display = "none" :firstnamecheck.style.display = "inline" ;
    //  regex expression for lastname value 
    firstnamepattern.test(form.inputLastName.value)? lastNameCheck.style.display = "none"  : lastNameCheck.style.display = "inline"
    //regex expression for testing emails
    emailchecker.test(form.inputemail.value)?emailCheck.style.display="none":emailCheck.style.display="inline"
    //regex expression for phone number
    phonenumberchecker.test(Number(form.inputPhonenumber.value))? phonenumber.style.display = "none": phonenumber.style.display ="inline"
    //regex expression for testing student number 
    studentNumber.test(Number(form.inputStudentIDnumber.value)) ? studentNumberSelector.style.display = "none" :studentNumberSelector.style.display = "inline" 
    //regex expression for Date of Birth 
    DOB.test(form.inputdateofbirth.value)? dateOfBirthChecker.style.display ="none": dateOfBirthChecker.style.display ="inline"
    //regex expression for first and second password 
    firstPassword.test(form.inputfirstpassword.value) ? firstPasswordLength.style.display = "none": firstPasswordLength.style.display = "inline"
    // for testing the password length 
    secondpasswordChecker.test(form.inputconfirmpassword.value) ? secondPasswordlength.style.display = "none": secondPasswordlength.style.display = "inline"
    //testing for confirming both first and second password 
    form.inputfirstpassword.value !== form.inputconfirmpassword.value ? passwordconfirmer.style.display = "inline":passwordconfirmer.style.display = "none"
}

function settingLocalStorage(){
//setting of data from the user input for local storage 
const localFirstName= form.firstname.value.trim();  
const localSecondName =form.inputLastName.value.trim();
const localEmail = form.inputemail.value.trim()
const localStudentIdNumber = form.inputStudentIDnumber.value.trim()
const localfirstpassword = form.inputfirstpassword.value.trim()
const localsecondpasssword = form.inputconfirmpassword.value.trim()

//setting up local storage using local storage API 
//setting up the object for obtaining data from users 
 let userInput = [{
    "firstname":localFirstName,
    "secondname": localSecondName,
    "email":localEmail,
    "student Number":localStudentIdNumber,
    "firstpassword":localfirstpassword,
    "secondpassword":localsecondpasssword
 }]

 //stringify the localstorage API data to store in browser
 let inputs = JSON.stringify(userInput)

 //using the localstorage function to setItems in the local storage 

    return localStorage.setItem("itemsStr", inputs)

   
}
//looping over the userinput to reset values put  

settingLocalStorage()

//adding users to the database from the front-end 
// setting event listeners 
 //adding prevent default to the form to prevent its default behavior
 //seting validation for the input fields in the form 
 //adding regex expression to the code 

form.addEventListener("submit",(e)=>{e.preventDefault()
    console.log("i am working")
 // using conditions to test form input before calling firestore
 
 if(form.firstname.value =="" || form.inputLastName.value =="" || form.inputemail.value =="" || form.inputPhonenumber.value =="" || form.inputStudentIDnumber.value == "" || form.inputdateofbirth.value =="" || form.inputfirstpassword.value =="" || form.inputconfirmpassword.value ==""){
    TestRegexPatterns()  
 }
 // using else statement to add users to the firestore database 
 else{
    addDoc(colRef,{
        firstname:form.firstname.value,
        lastname:form.inputLastName.value,
        email:form.inputemail.value,
        phonenumber:form.inputPhonenumber.value,
        studentnumber:form.inputStudentIDnumber.value,
        dob:form.inputdateofbirth.value,
        password:form.inputfirstpassword.value,
        confirmpassword:form.inputconfirmpassword.value,
        createdAt:serverTimestamp()
    
    }).then(()=>{          //if the form is successfully then reset the form 
        form.reset()
    })
 }
 
 })

//getting collection  data  from the firestore to showcase to the browser 
getDocs(colRef)
.then((snapshot)=>{
    // setting the collection of document to get users from our database
   let users= []
   snapshot.docs.forEach((doc)=>{
     users.push({...doc.data(), id:doc.id})
   })
   console.log(users)
})
.catch(err =>{
    console.log(err.message)
})

//getting realtime data collection  setting it up for getting  updated document

// getDocs(colRef, (snapshot)=>{
  
//     let users=[]
//     snapshot.docs.forEach(()=>{
//         users.push({...doc.data(), id:doc.id})
//     })
//     .catch(err =>{
//         console.log(err.message)
//     })
// })
    




//setting up a pop-up modal for the read here section 
terms.addEventListener("click", ()=>{
    popUp.style.display ="block"
})

//closing the popup bar by using the X element 

popClose.addEventListener("click", ()=>{
    popUp.style.display ="none"
})
