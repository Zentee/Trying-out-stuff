import React from "react";
import EmailBtn from "../img/Button-email.png";
import LinkedInBtn from "../img/Button.png";

export default function Buttons() {
  return (
    <div className="buttons">
      <a href="https://www.google.com" target="_blank" rel="noreferrer">
        <img src={EmailBtn} className="email-button" alt="email button" />
      </a>
      <a href="https://www.google.com" target="_blank" rel="noreferrer">
        <img
          src={LinkedInBtn}
          className="linkedin-button"
          alt="linkedin button"
        />
      </a>
    </div>
  );
}
