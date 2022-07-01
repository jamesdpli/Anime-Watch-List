import { useNavigate } from "react-router-dom";
import Footer from "../Footer/Footer";

const Account = () => {

    const navigate = useNavigate();
    const handleNavToExplore = () =>{
        navigate('/explore');
    }
    return(
        <div>
        <h2>Account Page</h2>
        {/* <Footer/> */}
        </div>
    );
}

export default Account;