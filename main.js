console.log("Welcome to the Community Portal");

alert("Page Loaded Successfully!");

const events = [

    {
        name: "Music Festival",
        category: "Music",
        date: "June 10",
        seats: 50
    },

    {
        name: "Food Carnival",
        category: "Food",
        date: "June 15",
        seats: 30
    }

];

const container = document.querySelector("#eventContainer");

const filter = document.querySelector("#categoryFilter");

function displayEvents(eventList){

    container.innerHTML = "";

    eventList.forEach(event => {

        const card = document.createElement("div");

        card.innerHTML = `

            <h2>${event.name}</h2>

            <p>Date: ${event.date}</p>

            <p>Seats: ${event.seats}</p>

            <button onclick="register()">
                Register
            </button>

            <hr>
        `;

        container.appendChild(card);

    });

}

displayEvents(events);

filter.onchange = function(){

    const selected = filter.value;

    if(selected === "All"){

        displayEvents(events);

    }

    else{

        const filteredEvents = events.filter(event => {

            return event.category === selected;

        });

        displayEvents(filteredEvents);

    }

};

function register(){

    alert("Registration Successful!");

}
try{

    let number = 10;

    console.log(number);

}
catch(error){

    console.log("Error Found");

}
const eventNames = events.map(event => {

    return event.name;

});

console.log(eventNames);
setTimeout(() => {

    alert("Welcome User!");

}, 2000);
const {name, date} = events[0];

console.log(name);

console.log(date);
const copiedEvents = [...events];

console.log(copiedEvents);
class Event{

    constructor(name){

        this.name = name;

    }

}

const event1 = new Event("Dance Show");

console.log(event1.name);
const form = document.querySelector("#myForm");

form.addEventListener("submit", function(event){

    event.preventDefault();

    const username =
    document.querySelector("#username").value;

    if(username === ""){

        alert("Name Required");

    }

    else{

        alert("Form Submitted");

    }

});
document.addEventListener("keydown", function(){

    console.log("Key Pressed");

});
fetch("https://jsonplaceholder.typicode.com/posts/1")

.then(response => response.json())

.then(data => console.log(data))

.catch(error => console.log(error));
async function getData(){

    const response =
    await fetch("https://jsonplaceholder.typicode.com/posts/1");

    const data = await response.json();

    console.log(data);

}

getData();
$("h1").click(function(){

    alert("Heading Clicked");

});