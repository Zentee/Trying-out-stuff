// import Header from "./Header";
// import Footer from "./Footer";
// import MainContent from "./MainContent";

const Header = require("./Header");

function App() {
  return (
    <div>
      <h1>yo</h1>
      <Header />
      {/* <MainContent />
      <Footer /> */}
    </div>
  );
}

ReactDOM.render(<App />, document.getElementById("root"));

// const element = <h1>Hello, world</h1>;
// ReactDOM.render(element, document.getElementById("root"));
