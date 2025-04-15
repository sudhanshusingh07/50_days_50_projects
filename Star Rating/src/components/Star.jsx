import React from "react";
import "./Star.css";
const Star = ({rating})=>{
    return (
      <div className="star-container">
        {[1, 2, 3, 4, 5].map((star) => (
          <span key={star}>{star <= rating ? "★" : "☆"}</span>
        ))}
      </div>
    );
}

export default Star