import React from "react";

export default function Joke(props) {
  return (
    <div>
      {props.starter && <h3>Setup: {props.starter}</h3>}
      {props.punchline && <p>Punchline: {props.punchline}</p>}
      <hr />
    </div>
  );
}
