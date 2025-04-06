import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./components/layout/pages/Home";
import About from "./components/layout/pages/About";
import Contact from "./components/layout/pages/Contact";
import Navbar from "./components/layout/layout/Navbar";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} /> 
          <Route path="/contact" element={<Contact />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
