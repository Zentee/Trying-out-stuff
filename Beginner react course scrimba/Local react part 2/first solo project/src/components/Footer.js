import React from "react";
import Twitter from "../img/Twitter Icon.png";
import FbIcon from "../img/Facebook Icon.png";
import InstagramIcon from "../img/Instagram Icon.png";
import GitHub from "../img/GitHub Icon.png";

export default function Footer() {
  return (
    <footer className="footer">
      <div className="icons-config">
        <img src={Twitter} alt="Twitter icon"></img>
        <img src={FbIcon} alt="Facebook icon"></img>
        <img src={InstagramIcon} alt="Instagram icon"></img>
        <img src={GitHub} alt="GitHub icon"></img>
      </div>
    </footer>
  );
}
