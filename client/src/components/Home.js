// import zenitsu from "./zenitsu.mp4";
import MoreInfo from "./MoreInfo";
import demonSlayer from "../assets/demonSlayer.mp4";
import "./Home.css";
import Footer from "../components/Footer/Footer";
import "./home-banner.css";

const Home = () => {
  return (
    <div>
      <header
        className="banner-home"
        style={{
          backgroundSize: "cover",
          backgroundImage:
            "url(https://www.fanbolt.com/storage/2021/08/anime-iphone-wallpaper-800x500.jpg)",
          backgroundPosition: "center, center",
        }}
      >
        
          <div className="text-container">
          <h1 className="header">Unlimited Anime and more</h1>
          <h3 className="header-text">
            Watch your favourite anime anywhere for free.
          </h3>
          <h3 className="header-text">Ready to explore? Click on Account.</h3>
        </div>
      
        <div className="banner--fadeButtom" />
      </header>

      <MoreInfo />
    </div>
  );
};
export default Home;

/* <div className="story-card-main">




<div className="story-card">
    
  <div className="story-card-background">
      
      
    <div className="vid-wrapper">
      <img src="https://www.fanbolt.com/storage/2021/08/anime-iphone-wallpaper-800x500.jpg" alt="wallpaper"/>
      <div className="vid-gradient"> <div className="card-text">
<div className="text-container">
<h1 className="header">Unlimited Anime and more</h1>

<h3 className="header-text">Watch your favourite anime anywhere for free.</h3>
<h3 className="header-text">
  Ready to watch? Click on Sign in.
</h3>
<br />
</div>
</div></div>
     
    </div>
    
  </div>
  
</div>
</div> */
