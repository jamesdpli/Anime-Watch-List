// import zenitsu from "./zenitsu.mp4";
import MoreInfo from "./MoreInfo";
import demonSlayer from "../assets/demonSlayer.mp4"


const Home = () => {
  return (
    <div className="story-card-main">




      <div className="story-card">
          
        <div className="story-card-background">
            
            
          <div className="vid-wrapper">
            <video src={demonSlayer} autoPlay loop muted className="vid" />
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

     

    <MoreInfo/>



    </div>
  );
};

export default Home;
