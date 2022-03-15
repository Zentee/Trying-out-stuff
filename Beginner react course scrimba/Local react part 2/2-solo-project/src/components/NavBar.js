import worldLogo from "../img/world-logo.png";

export default function NavBar() {
  return (
    <nav className="navbar-container">
      <img className="navbar-logo" src={worldLogo}></img>
      <p className="navbar-title">my travel journal.</p>
    </nav>
  );
}
