
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


// using flutterwave SDK for payment integration 
    payButton.addEventListener("click", function makePayment() {
      FlutterwaveCheckout({
        public_key: "FLWPUBK_TEST-f140c3529e4a57ac80a1aa39422022a7-X",
        tx_ref: "titanic-48981487343MDI0NzMx",
        amount: 20,
        currency: "EUR",
        payment_options: "card, banktransfer, ussd",
        redirect_url: "https://glaciers.titanic.com/handle-flutterwave-payment",
        meta: {
          consumer_id: 23,
          consumer_mac: "92a3-912ba-1192a",
        },
        customer: {
          email: "rose@dbs.ie",
          phone_number: "+353851199543",
          name: "Rose DeWitt Bukater",
        },
        customizations: {
          title: "How To be a Spoof master",
          description: "Wireshark",
          logo: "https://res.cloudinary.com/innov8it/image/upload/v1681001261/image_3_a6s7b7.png",
        },
      });
    })



    


  
  