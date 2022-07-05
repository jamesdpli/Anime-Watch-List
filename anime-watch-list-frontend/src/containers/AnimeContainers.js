import './AnimeContainers.css';
import { Link } from "react-router-dom";
import { useRef } from 'react';

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


    return(
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
    );
}

export default AnimeContainer;