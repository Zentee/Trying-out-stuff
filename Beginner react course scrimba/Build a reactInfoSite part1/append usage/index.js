const samplePage = (
  <section>
    <div>
      <h1>this is my world</h1>
      <p> is it?</p>
    </div>
  </section>
);

document.getElementById("root").append(JSON.stringify(samplePage));

ReactDOM.render(samplePage, document.getElementById("root"));
