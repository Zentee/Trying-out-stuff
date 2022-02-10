function PageComponent() {
  return (
    <div>
      <header>
        <nav>
          <img src="img/react-logo.png" width="100px"></img>
        </nav>
      </header>
      <h1> Reason's I'm excited to learn react</h1>
      <ul>
        <li>Lost Ark</li>
        <li>Getting Better</li>
        <li>Path of Exile</li>
      </ul>
      <footer>
        <small>"© 2022 Zent development. All rights reserved."</small>
      </footer>
    </div>
  );
}

ReactDOM.render(
  <PageComponent></PageComponent>,
  document.getElementById("root")
);
