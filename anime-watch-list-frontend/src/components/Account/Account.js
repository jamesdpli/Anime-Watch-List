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
                    <li>Welcome back&nbsp;</li>
                    <li className="user-name">&nbsp;{currentAnimeAcc.name}&nbsp;</li>
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
            {/* <img
            className="anime-img"
            src="https://pbs.twimg.com/media/EqQT6TjXYAUMTvL.jpg"
            alt="Attack on Titan"
            />
            <img
            className="anime-img"
            src="https://cdn.animenewsnetwork.com/hotlink/thumbnails/max700x700/cms/news.2/147637/001_size8.jpg"
            alt="one piece"
            /> */}
        </div>
        </div>
        </div>
            {/* <div className="welcome">
            <span id="splash-overlay" class="splash"></span>
            <span id="welcome" class="z-depth-4"></span>
            </div> */}

        </div>
    );
}

export default Account;