import React from "react";
import Navbar from "./components/Navbar";
import Hero from "./components/Hero";
import Card from "./components/Card";
import katieZaferes from "./img/image_12.png";

export default function App() {
  // <Hero />
  return (
    <div>
      <Navbar />
      <Card
        img={katieZaferes}
        rating="5.0"
        reviewCount={6}
        country="Ukraine"
        title="Life lessons with Katie Zaferes"
        price={136}
      />
    </div>
  );
}
