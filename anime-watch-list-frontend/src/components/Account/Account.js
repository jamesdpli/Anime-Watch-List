import { useNavigate } from "react-router-dom";
import Footer from "../Footer/Footer";
import './Account.css';

const Account = ({currentAnimeAcc, setCurrentAnimeAcc}) => {

    const navigate = useNavigate();

    const handleNavToExplore = () =>{
        navigate('/explore');
    }

    return(
        <div className="account-container">
            <div className="welcomeback-title">
                <ul className="welcome-back-div">
                    <li>Welcome back&nbsp;&nbsp;{currentAnimeAcc.name}&nbsp;</li>
                    <img src="http://pm1.narvii.com/6825/868e382ae2074d0fc7ae1c8a7bcf771e580e776av2_00.jpg" alt="Avatar" className="avatar"/>
                </ul>
            </div>
            <div><h2>Explore here</h2></div>
        <div className="anime-container">
        <div className="anime-parent-container">
        <div className="anime-text">
            <h1 className="anime-title">Popular Animes</h1>
            <h2 className="anime-subtitle">
            See what is popular right now!
            </h2>
        </div>
        <div className="anime-img-container">
        <div class="section one active"></div>
        <div class="section two"></div>
        <div class="section three"></div>
        <div class="section four"></div>
        </div>
        </div>
        </div>
            {/* <div className="welcome">
            <span id="splash-overlay" class="splash"></span>
            <span id="welcome" class="z-depth-1"></span>
            </div> */}

        </div>
    );
}

export default Account;