import React from "react";
import "./Button.css";

const Button = ({ variant = "primary", onClick, children }) => {
  return (
    <button onClick={onClick} className={`button ${variant}`}>
      {children}
    </button>
  );
};

export default Button;
