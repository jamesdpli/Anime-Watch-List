import { Link } from "react-router-dom";

const AnimeContainer = () =>{
    return(
        <nav className="nav-bar">
            <ul className="nar-ul">
                <li><Link to='/home'>Home</Link></li>
                <li><Link to='/explore'>Explore</Link></li>
                <div className="dropdown">
                <button className="dropbtn"> Account</button>
                    <div className="dropdown-content" styleleft="left:0">
                        <a><Link to='/account'>Sign Up</Link></a>
                        <a><Link to='/login'> Login</Link></a>
                    </div>
                </div>
            </ul>
        </nav>
    );
}

export default AnimeContainer;