import { Link } from "react-router-dom";

const AnimeContainer = () =>{
    return(
        <nav className="nav-bar">
            <ul className="nar-ul">
                <li><Link to='/home'>Home</Link></li>
                <li><Link to='/explore'>Explore</Link></li>
                <div className="dropdown">
                    <li>
                    <a className="nav-dropdown" href="#" role="button" data-bs-toggle="dropdown">Account</a>
                    <ul className="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a className="dropdown-item" href="#">Action</a></li>
                        <li><a className="dropdown-item" href="#">Another action</a></li>
                    </ul>
                    </li> 
                </div>
            </ul>
        </nav>
    );
}

export default AnimeContainer;