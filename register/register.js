 "use strict"


//  setting the GEOlocation API

if(navigator.geolocation)
    navigator.geolocation.getCurrentPosition(function(){
        console.log(position)
    },function(){
        alert("Your position could not be derived")
    })


