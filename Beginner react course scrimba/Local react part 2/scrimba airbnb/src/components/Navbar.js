import React from "react";
import airbnbLogo from "../img/airbnb 1.png";

export default function Navbar() {
  return (
    <nav>
      <img src={airbnbLogo} className="nav--logo" />
    </nav>
  );
}
