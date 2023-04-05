const slider = document.querySelector('.slider');
const cards = document.querySelectorAll(".cards");
const sliderLeftArrow = document.querySelector('.slider-arrow-left');
const sliderRightArrow = document.querySelector('.slider-arrow-right');


function slideTo(index) {
  slider.style.transform = `translateX(-${index * 25}%)`;
  setActiveCard(index);
  currentIndex = index;
}

function slideNext() {
  if (currentIndex === cards.length - 1) {
    slideTo(0);
  } else {
    slideTo(currentIndex + 1);
  }
}

function slidePrev() {
  if (currentIndex === 0) {
    slideTo(cards.length - 1);
  } else {
    slideTo(currentIndex - 1);
  }
}

// sliderLeftArrow.addEventListener('click', () => {
//   slider.scrollBy({ left: -400, behavior: 'smooth' });
// });

// sliderRightArrow.addEventListener('click', () => {
//   slider.scrollBy({ left: 400, behavior: 'smooth' });
// });

sliderLeftArrow.addEventListener('click', slidePrev());
sliderRightArrow.addEventListener('click', slideNext());