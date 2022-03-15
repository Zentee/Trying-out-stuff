import React from "react";
import NavBar from "./components/NavBar";
import Card from "./components/Card";
import CardData from "./data";
import "./style.css";

export default function App() {
  const cards = CardData.map((card, index) => {
    return <Card key={`card-${index}`} card={card} />;
  });

  return (
    <>
      <NavBar />
      {cards}
    </>
  );
}
