import React from "react";
import Navbar from "./components/Navbar";
import Hero from "./components/Hero";
import Card from "./components/Card";
import cardData from "./data";

export default function App() {
  const cardInfo = cardData.map((card) => (
    <Card key={card.id} img={`../img/${card.coverImg}`} card={card} />
  ));

  // <Hero />
  return (
    <div>
      <Navbar />
      <section className="cards-list">{cardInfo}</section>
    </div>
  );
}
