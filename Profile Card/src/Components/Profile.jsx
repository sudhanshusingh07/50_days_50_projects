import React from "react";
import "./Profile.css";

const Profile = (props) => {
  return (
    <div className="upc">
      <div className="gradiant"></div>
      <div className="profile-down">
        <img src={props.img} alt="" />
        <div className="profile-title">{props.name}</div>
        <div className="profile-bio">{props.bio}</div>
        <div className="profile-add">{props.location}</div>
      </div>
    </div>
  );
};

export default Profile;
