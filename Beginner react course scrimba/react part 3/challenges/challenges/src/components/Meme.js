import React, { useState } from "react";
import memesData from "../memesData";

export default function Meme() {
  let url;
  console.log(url);
  const [memeImage, setMemeImage] = useState("");

  function getMemeImage() {
    const memesArray = memesData.data.memes;
    const randomNumber = Math.floor(Math.random() * memesArray.length);
    url = memesArray[randomNumber].url;
    console.log("I'm doing this");
    setMemeImage(url);
  }

  function onMouseClick() {
    console.log("I'm working");
  }

  return (
    <main>
      <div className="form">
        <input
          onClick={onMouseClick}
          type="text"
          placeholder="Top text"
          className="form--input"
        />
        <input type="text" placeholder="Bottom text" className="form--input" />
        <button onClick={getMemeImage} className="form--button">
          Get a new meme image 🖼
        </button>
      </div>
      <img src={memeImage} className="meme-image" />
    </main>
  );
}
