import { useNavigate } from "react-router-dom";
import Footer from "../Footer/Footer";

const Account = ({currentAnimeAcc}) => {

    const navigate = useNavigate();
    const handleNavToExplore = () =>{
        navigate('/explore');
    }
    return(
        <div className="account-container">
            <div className="welcomeback-title">
                <ul className="welcome-back-div">
                    <li>Welcome back&nbsp;</li>
                    <li className="user-name">&nbsp;{currentAnimeAcc.username}&nbsp;</li>
                </ul>
            </div>
            

        </div>
    );
}

export default Account;