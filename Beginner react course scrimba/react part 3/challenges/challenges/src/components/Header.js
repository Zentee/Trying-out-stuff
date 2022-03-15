import logo from "../img/Troll Face.png";

export default function Header() {
  return (
    <header className="header-container">
      <img src={logo} alt="troll face"></img>
      <h3 className="header-title">Meme Generator</h3>
      <p className="header-txt">React Course - Project 3</p>
    </header>
  );
}
