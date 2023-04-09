
const cookieBox = document.querySelector(".wrapper");
const buttons = document.querySelectorAll(".button");
const quotegenerate = document.querySelector(".weather-check")
const nameQuote= document.querySelector (".country")
const person = document.querySelector(".city")



const executeCodes = () => {
//if cookie contains codinglab it will be returned and below of this code will not run
if (document.cookie.includes("cobra")) return;
cookieBox.classList.add("show");

buttons.forEach((button) => {
  button.addEventListener("click", () => {
    cookieBox.classList.remove("show");

    //if button has acceptBtn id
    if (button.id == "acceptBtn") {
      //set cookies for 1 month. 60 = 1 min, 60 = 1 hours, 24 = 1 day, 30 = 30 days
      document.cookie = "cookieBy= cobra; max-age=" + 60 * 60 * 24 * 30;
    }
  });
});
};

//executeCodes function will be called on webpage load
window.addEventListener("load", executeCodes);




const quotes = [
    {
        words:"In the face of inhumanity, a good man reacts, but a great one acts",
        person:"James Rollins",
    },
    {
        words:"Palaces are for the little men not for the great men because great man is humble!",
        person:"Mehmet Murat ildan",
    },
    {
        words:"Greatness lies not in ruling a people, it lies in being the cause of happiness in their lives",
        person:"Abhijit Naskar",
    },
    {
        words:"I have seen great men err and err greatly",
        person:"Bangambiki Habyarimana",
    },
    {
        words: "The greatness of God alone is greater than the greatness of many great men combined.",
        person:"Gift Gugu Mona"
    }

] 



// set interval for ensuring quotes come randolmy 
const read = setInterval(()=>{
    let random = Math.floor(Math.random() * quotes.length);
    nameQuote.innerText= quotes[random].words;
     person.innerText= quotes[random].person;
}, 3000)

// added the window event listener for generating code 
window.addEventListener("load", read())




