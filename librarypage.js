//create an object for the books 
 const library = [
   {
     bookname:"Book1",
     author:"wire shark",
     title:"How to be a spoff master",
     status:"Borrow",
     cover:"https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png"
 
   },
   {
     bookname:"Book2",
     author:"wire shark",
     title:"How to be a spoff master",
     status:"Borrow",
     cover:"https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png"
 
   }, {
     bookname:"Book3",
     author:"wire shark",
     title:"How to be a spoff master",
     status:"Borrow",
     cover:"https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png"
 
   },
   {
     bookname:"Book4",
     author:"wire shark",
     title:"How to be a spoff master",
     status:"Borrow",
     cover:"https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png"
 
   },
   {
     bookname:"Book5",
     author:"wire shark",
     title:"How to be a spoff master",
     status:"Borrow",
     cover:"https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png"
 
   },
   {
     bookname:"Book6",
     author:"wire shark",
     title:"How to be a spoff master",
     status:"Borrow",
     cover:"https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png"
 
   },
   {
     bookname:"Book7",
     author:"wire shark",
     title:"How to be a spoff master",
     status:"Borrow",
     cover:"https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png"
 
   },
   {
     bookname:"Book8",
     author:"wire shark",
     title:"How to be a spoff master",
     status:"Borrow",
     cover:"https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png"
 
   },
   {
     bookname:"Book9",
     author:"wire shark",
     title:"How to be a spoff master",
     status:"Borrow",
     cover:"https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png"
 
   },
   {
     bookname:"Book10",
     author:"wire shark",
     title:"How to be a spoff master",
     status:"Borrow",
     cover:"https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png"
 
   }
 
 ]
 
 
  
  //// using javascript for function 
 
  // for the search bar of the form
  const form = document.querySelector("#formbook")
  // for hiding the carousel
  const hideswiper = document.querySelector(".hide-swiper")
  //wrapper for the total carousel
  const swipwrarp = document.querySelector(".swiper-wrapper")
  // cover for the image
  const slidercover = document.querySelector(".swiper-slide-control")
 // cover for the image cover 
 const imagecover= document.querySelector(".cards")
 // book title 
 const booktitle = document.querySelector(".book-title")
 // book author
 const bookauthor = document.querySelector(".author")
 // full name of the book 
 const fullname = document.querySelector(".abstract")
 // to control the payment 

// for single page payment 
const singlepay = document.querySelector("#singlebutton")

// to view all books
const viewpages = document.querySelector(".movepages")
  form.addEventListener("submit", (e)=>{
   e.preventDefault()
   const searchvalue =form.books.value.trim()
   // hideswiper.style.display = "none"
   // slidercover.style.display ="none";
   // console.log(searchvalue)
   library.forEach((books)=>{
    if(books.bookname == searchvalue){
     hideswiper.style.display = "none";
     slidercover.style.display ="block";
     booktitle.textContent = books.bookname;
     singlepay.textContent = "Pay now ....";
     viewpages.style.display ="block"
        }
   })
   
  })

   // for sinlge page payment 
 singlepay.addEventListener("click", makePayment)
 
 
   