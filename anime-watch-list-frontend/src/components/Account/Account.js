// import { useNavigate } from "react-router-dom";
// import Footer from "../Footer/Footer";
import './Account.css';
import { Link } from "react-router-dom";
import Carousel from '../../assets/Carousel/Carousel';

const Account = ({currentAnimeAcc, setCurrentAnimeAcc}) => {

    // const navigate = useNavigate();

    // const handleNavToExplore = () =>{
    //     navigate('/explore');
    // }

// Selecting all sections with class of section
const sections = document.querySelectorAll('.section')

// On click event for each section
sections.forEach((section)=>{
section.addEventListener('click',()=>{
    // remove active class from all another section
    // and add it to the selected section
    sections.forEach((section) => {
        section.classList.remove('active')
    })
    section.classList.add('active')
})
})


    return(
        <div className="account-container">
            <div className="welcomeback-title">
                <ul className="welcome-back-div">
                
                    <li><img src="http://pm1.narvii.com/6825/868e382ae2074d0fc7ae1c8a7bcf771e580e776av2_00.jpg"alt="Avatar" className="avatar"/>Welcome back&nbsp;&nbsp;{currentAnimeAcc.name}&nbsp;</li>
                    
                </ul>
            </div>
            
        <div className="anime-container">
        <div className="anime-parent-container">
        <div className="anime-text">
            <h1 className="anime-title">Popular Animes</h1>
            <h2 className="anime-subtitle">
            See what is popular right now!
            </h2>
        </div>
        {/* adding watched list function */}
        <p className="watched-li"><Link to='/userWatchList'> <button  className="watched-link">My WatchList</button></Link></p>
        </div>
        </div>
        <br/>
        <div>
            <br/>
        <div className='account-container-1'>
            <h1 className='account-title'>Find more of your favourite anime ....</h1>
            <Carousel/>
        </div>
        <br/><br/>

            <div className='anime-container'>
            <h2>Click here</h2>
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