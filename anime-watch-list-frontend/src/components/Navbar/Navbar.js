import logo from "./logo.png";
import "./navbar.css";
import { Link } from "react-router-dom";
import { height } from "@mui/system";

const Navbar = () => {
  return (
    <div className="story-header-container">
      <div className="story-header">
        <img
          className="logo"
          src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Apple_Computer_Logo_rainbow.svg/1757px-Apple_Computer_Logo_rainbow.svg.png"
          style={{
            width: "60px",
            height: "55px",
          }}
          alt="logo"
        />
        <Link to='/login'>
        <button className="signin-button" style={{ height: "2rem",
      width: "6rem"}}>Sign in</button></Link>
      </div>
    </div>
  );
};

export default Navbar;
