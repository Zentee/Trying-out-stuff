import React from "react";
import profilePicture from "../img/profile-picture.png";

export default function Photo() {
  return (
    <div className="profile-photo">
      <img src={profilePicture} alt="profile photo" />
    </div>
  );
}
