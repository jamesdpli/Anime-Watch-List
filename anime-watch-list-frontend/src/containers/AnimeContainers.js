import './AnimeContainers.css';
import { Link } from "react-router-dom";
import { useRef } from 'react';
import { useEffect, useState } from "react";
import SwipeableTemporaryDrawer from "../components/Drawer/SwipeableTemporaryDrawer"

const AnimeContainer = ({ isLogin, setIsLogin, currentAnimeAcc, setCurrentAnimeAcc}) =>{

    // checking if the account for the user is logged in
    const handleLogin = (event) => {


        if (isLogin && currentAnimeAcc.length != 0) {
            setIsLogin(!isLogin);
            setCurrentAnimeAcc({});
            console.log(isLogin);
            return;
        }
    }

    const [show, handleShow] = useState(false);

    const transitionNavBar = () => {
      if (window.scrollY > 100) {
        handleShow(true);
      } else {
        handleShow(false);
      }
    };
  
    useEffect(() => {
      window.addEventListener("scroll", transitionNavBar);
      return () => window.removeEventListener("scroll", transitionNavBar);
    }, []);
  
    return (
      <div className={`nav ${show && "nav-black"}`}>
        <div className="nav-contents">
          <div className="nav-drawer">
            <Link to="/">
              <img
                className="nav-logo"
                src="https://assets.stickpng.com/images/580b57fcd9996e24bc43c529.png"
                alt="logo"
              />
            </Link>
            <SwipeableTemporaryDrawer/>
  
            
          </div>
          <nav className="nav-bar">
<ul className="nar-ul">
    <li><Link to='/home'>Home</Link></li>
    <li><Link to='/explore'>Explore</Link></li>
    <div className="dropdown">
    <button className="dropbtn"> Account</button>
        <div className="dropdown-content" styleleft="left:0">
        <Link to='/account'>{isLogin ? "Account" : "Sign Up"}</Link>
       <Link to='/login'  onClick={handleLogin}>{isLogin ? "Logout" : "Login"}</Link>
        </div>
    </div>
</ul>
</nav> 
        
      
        </div>
      </div>
    );
}

export default AnimeContainer;





//  <nav className="nav-bar">
// <ul className="nar-ul">
//     <li><Link to='/home'>Home</Link></li>
//     <li><Link to='/explore'>Explore</Link></li>
//     <div className="dropdown">
//     <button className="dropbtn"> Account</button>
//         <div className="dropdown-content" styleleft="left:0">
//         <Link to='/account'>{isLogin ? "Account" : "Sign Up"}</Link>
//        <Link to='/login'  onClick={handleLogin}>{isLogin ? "Logout" : "Login"}</Link>
//         </div>
//     </div>
// </ul>
// </nav> 