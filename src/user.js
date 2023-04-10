"use strict"

//selecting elements to show books in which was borrowed 
const datecheck = document.querySelector(".date-check");
const contact = document.querySelector(".contact");
const notify= document.querySelector("#notification");
const bookTitle = document.querySelector(".title-control");
const bookDesc = document.querySelector(".description"); 
const bookStatus = document.querySelector(".status");
const returnBookdate = document.querySelector(".returnDdate");
const showBook = document.querySelector("#showBook")
const bookCover= document.querySelector(".image-show")

// creating date to determine when a user logged in last into the dashboard of the library 
const before= new Date("Mon Apr 10 2023 12:40:46")
const now = new Date()

//using dateFns for implementation



const loginChecker = dateFns.distanceInWords(before,now)


//adding the windows event to load the time 

window.addEventListener("load", ()=>{
    datecheck.innerHTML =`<span>You logged in ${loginChecker} ago</span>`;
    datecheck.style.color = "black";
    datecheck.style.padding ="9px";
    datecheck.style.fontWeight ="bold";
    notification.style.display="block";
   
})



  //creating a function to get a difference between the borrowed date and future date 
  const today= new Date();
  //  const futureDate =future.setDate(future.getDate() + 14)
  const oneWeek = 604800000 
  const futureDate = new Date () 
  const accumDate = futureDate.getTime() + oneWeek
   const returnDate = new Date(accumDate)

//added object to display the books when borrowed  

const userIdentifier = {
    title: "How To be a Spoof master",
    description: "Wireshark",
    logo: "https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png",
    status : "borrowed",
    Returndate: returnDate
}

///setting event listener to check for notifications about book history only when you are online and offline if you offline 

// event listener to display borrowed books on the user dashboard 

showBook.addEventListener("click", ()=>{
    bookTitle.textContent = userIdentifier.title;
    bookDesc.textContent = userIdentifier.description;
    bookCover.innerHTML =  `<img src="https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png " class="img-center">`
    bookStatus.textContent= `Borrowed`
    returnBookdate.textContent = `Return Date : ${userIdentifier.Returndate}`

})

