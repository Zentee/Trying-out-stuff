import React from "react";
import Photo from "./components/Photo";
import Name from "../src/components/Name";
import Buttons from "./components/Buttons";
import About from "../src/components/About";
import Footer from "./components/Footer";

export default function App() {
  return (
    <div className="main-content">
      <Photo />
      <Name />
      <Buttons />
      <About />
      <Footer />
    </div>
  );
}
