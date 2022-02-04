const navBar = (
  <nav>
    <h1>jsx first lesson</h1>
    <ul>
      <li>Pricing</li>
      <li>About</li>
      <li>Contact</li>
    </ul>
  </nav>
);

const sections = (
  <section>
    <div>
      <h1>trying another section</h1>
      <p>let's see if this one works</p>
    </div>
  </section>
);

ReactDOM.render(navBar, document.getElementById("root"));

ReactDOM.render(sections, document.getElementById("try"));
