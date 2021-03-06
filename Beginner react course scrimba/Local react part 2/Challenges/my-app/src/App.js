import React from "react";
import Joke from "../src/components/Joke";
import jokesData from "./jokesData";

export default function App() {
  const jokeElements = jokesData.map((joke) => {
    return <Joke starter={joke.setup} punchline={joke.punchline} />;
  });

  return <div>{jokeElements}</div>;
}
