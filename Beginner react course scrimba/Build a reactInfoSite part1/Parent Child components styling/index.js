function Header() {
  return (
    <header>
      <nav className="nav-bar">
        <img src="img/react-logo.png" className="nav-logo" />
        <ul className="nav-items">
          <li>Pricing</li>
          <li>About</li>
          <li>Contact</li>
        </ul>
      </nav>
    </header>
  );
}

function Body() {
  return (
    <div className="lesson-body">
      <h1>Reasons I'm excited to learn React</h1>
      <ol>
        <li>
          It's a popular library, so I'll be able to fit in with the cool kids!
        </li>
        <li>I'm more likely to get a job as a developer if I know React</li>
      </ol>
    </div>
  );
}

function Footer() {
  return (
    <div className="footer">
      <footer>
        <small>© 2021 Ziroll development. All rights reserved.</small>
      </footer>
    </div>
  );
}

function Page() {
  return (
    <div>
      <Header />
      <Body />
      <Footer />
    </div>
  );
}

ReactDOM.render(<Page />, document.getElementById("root"));
