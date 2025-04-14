import React from "react"
import Profile from "./Components/Profile"
import "./App.css";


function App() {
  

  return (
    <>
      <Profile
        name="Iron Man"
        bio="Avenger"
        location="Stark Tower"
        img="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS1rIWZdIa6hfBRsNAFtrRjPFreZQj9Zomtgg&s"
      />
      <Profile
        name="Thor"
        bio="Avenger"
        location="Asgard"
        img="https://variety.com/wp-content/uploads/2022/08/patty-thor-2.png"
      />
      
    </>
  );
}

export default App
