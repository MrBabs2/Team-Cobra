"use strict"

const datecheck = document.querySelector(".date-check")
const contact = document.querySelector(".contact")

// creating date to determine when a user logged in last into the dashboard of the library 
const before= new Date("Mon Apr 10 2023 12:40:46")
const now = new Date()

//using dateFns for implementation



const loginChecker = dateFns.distanceInWords(before,now)


//adding the windows event to load the time 

window.addEventListener("load", ()=>{
    datecheck.innerHTML =`<span>You logged in ${loginChecker} ago</span>`;
    datecheck.style.color = "black";
    datecheck.style.padding ="9px"
    datecheck.style.fontWeight ="bold"
})




