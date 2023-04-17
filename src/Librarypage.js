
// Dom mainpultation for payment 
const first = document.querySelector("#first-button")
const second = document.querySelector("#second-button")
const third = document.querySelector("#third-button")
const fourth = document.querySelector("#fourth-button")
const fifth = document.querySelector("#fifth-button")
const sixth = document.querySelector("#sixth-button")
const seventh = document.querySelector("#seventh-button")
const eight = document.querySelector("#eight-button")
const nine = document.querySelector("#ninth-button")
const ten = document.querySelector("#tenth-button")
const payButton = document.querySelector(".checkout")




 
    

const buttons = [first,second,third,fourth,fifth,sixth,seventh,eight,nine,ten]
 
// click the borrow button to see the payment for flutterwave
buttons.forEach((button)=>{
 button.addEventListener("click",()=>{
  payButton.style.display="block"
  button.style.backgroundColor ="#ed8e00;"
 })
})


function makePayment() {
  FlutterwaveCheckout({
    public_key: "FLWPUBK_TEST-f140c3529e4a57ac80a1aa39422022a7-X",
    tx_ref: "titanic-48981487343MDI0NzMx",
    amount: 200,
    currency: "EUR",
    payment_options: "card, banktransfer, ussd",
    redirect_url: "https://glaciers.titanic.com/handle-flutterwave-payment",
    meta: {
      consumer_id: 23,
      consumer_mac: "92a3-912ba-1192a",
    },
    customer: {
      email: "akpofure.otite@gmail.com",
      phone_number: "+353851199543",
      name: "Rose DeWitt Bukater",
    },
    customizations: {
      title: "How To be a Spoof master",
      description: "Wireshark",
      logo: "https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png",
    },
  });
}



// using flutterwave SDK for payment integration 
    payButton.addEventListener("click",makePayment )

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

 // to view all books to default 

 viewpages.addEventListener("click", ()=>{
  hideswiper.style.display = "block";
  slidercover.style.display ="none";
  viewpages.style.display ="none"
 })
  