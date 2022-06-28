
import { useState, useEffect, useRef } from 'react';
import { Link } from 'react-router-dom';
// import usePersistedState from "../components/usePersistedState";

// import picture from "../images/logo603x186.png";
// import { GiMagnifyingGlass } from 'react-icons/gi';


const AnimeContainer = ({ isLogin, setIsLogin, currentAnimeAcc, setCurrentAnimeAcc }) => {


    // handle login button in the navbar
    // if there is user logged in, when click 'log out'
    // set isLogin 'false', set currentp odcast account empty {}
    const handleLogin = (event) => {


        if (isLogin && currentAnimeAcc.length != 0) {
            setIsLogin(!isLogin);
            setCurrentAnimeAcc({});
            console.log(isLogin);
            return;
        }

    }

    const inputSearchValueRef = useRef();

    const handleSearch = () => {
        const search = inputSearchValueRef.current.value;
        console.log(search);
    }



    return (
        // was <div> -> <nav>
        <nav className="nav-bar">
            <ul className="nar-ul">
                <div className="nav-logo">
                    <a className="logo-there" />
                    {/* <span className="resize"> <Link to='/'><img src={picture} alt=""/></Link></span> */}
                </div>

                <li><Link to='/home'>Home</Link></li>
                <li><Link to='/explore'>Explore</Link></li>

                <div className="dropdown">
                    <button className="dropbtn"> Account</button>
                    <div className="dropdown-content" styleleft="left:0">
                        <a><Link to='/account'>{isLogin ? "Account" : "Sign Up"}</Link></a>
                        <a onClick={handleLogin}><Link to='/login'>{isLogin ? "Logout" : "Login"}</Link></a>
                    </div>
                </div>
                {/* <div id="search-bar">
                    <input ref={inputSearchValueRef} type="text" placeholder="Search for your podcast..." id="search-bar-box"></input>
                    <button id="search-btn" onClick={handleSearch}><GiMagnifyingGlass/></button>
                </div> */}
            </ul>
        </nav>
    );
}

export default AnimeContainer;