import React from "react";
import Button from "./components/Button";
import "./App.css";
const App = () => {
  const handleClick1 = () => {
    alert("Primary Button Clicked!");
  };

  const handleClick2 = () => {
    alert("Secondary Button Clicked!");
  };

  return (
    <div>
      <Button variant="primary" onClick={handleClick1}>
        Click Me
      </Button>

      <Button variant="secondary" onClick={handleClick2}>
        Another Button
      </Button>
    </div>
  );
};

export default App;
