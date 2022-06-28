const Cover = () =>{
    return(
        <div className="main">

    <div className="overlay"></div>
    
    <video src={zenitsu} autoPlay loop muted />

    <div className="content">
        <h1 className="header">Unlimited Anime and more</h1>

        <h3 className="header-text">Watch your favourite anime anywhere.</h3>
        <h3 className="header-text">
        Ready to watch? Enter your email to create or restart your membership.
        </h3>
        <br />
        {/* <TextField
        id="filled-basic"
        label="Email address"
        variant="filled"
        style={{
            backgroundColor: "white",
            width: "45%",
        }}
        /> */}
        <br />
        {/* <Button
        size="large"
        style={{
            backgroundColor: "#e81515",
            width: "10%",
            color: "white",
        }}
        >
        Get Started
        </Button> */}
    </div>

    <div className="anime-container">
        <div className="anime-parent-container">
        <div className="anime-text">
            <h1 className="anime-title">Popular Animes.</h1>
            <h2 className="anime-subtitle">
            Watch the most popular animes out right now!
            </h2>
        </div>
        <div className="anime-img-container">
            <img
            className="anime-img"
            src="https://pbs.twimg.com/media/EqQT6TjXYAUMTvL.jpg"
            alt="Attack on Titan"
            />
            <img
            className="anime-img"
            src="https://cdn.animenewsnetwork.com/hotlink/thumbnails/max700x700/cms/news.2/147637/001_size8.jpg"
            alt="one piece"
            />
        </div>
        </div>
    </div>

    <div className="anime-container">
        <div className="anime-parent-container">
        <div className="anime-img-container-reversed">
            <img
            className="anime-img"
            src="https://pbs.twimg.com/media/E659_EdVEAU-FHQ.jpg"
            alt="Summer Time Rendering"
            />
            <img
            className="anime-img"
            src="https://m.media-amazon.com/images/M/MV5BM2Q5YjJmY2EtM2RhZi00M2FjLWFhYzEtNmE3OWFjNmI3N2I0XkEyXkFqcGdeQXVyMTEzMTI1Mjk3._V1_.jpg"
            alt="Aoashi"
            />
        </div>
        <div className="anime-text-reversed">
            <h1 className="anime-title">Trending Animes.</h1>
            <h2 className="anime-subtitle">
            Watch this weeks top trending animes!
            </h2>
        </div>
        </div>
    </div>
    <div className="anime-container">
        {" "}
        <div className="anime-parent-container">
        <div className="anime-text">
            <h1 className="anime-title"> Upcoming Animes.</h1>
            <h2 className="anime-subtitle">
            Watch trailers for new seasons coming out!
            </h2>
        </div>
        <div className="anime-img-container">
            <img
            className="anime-img"
            src="https://m.media-amazon.com/images/M/MV5BODY5Y2M2ZDAtODAxMi00MDFjLWJlNGEtZDcwZWUxZjFkN2NiXkEyXkFqcGdeQXVyMTM0MzcxNTEx._V1_FMjpg_UX1000_.jpg"
            alt="Bleach"
            />
            <img
            className="anime-img"
            src="https://boundingintocomics.com/wp-content/uploads/2022/06/2022.06.20-12.49-boundingintocomics-62afc428248bc.png"
            alt="My hero academia"
            />
        </div>
        </div>
    </div>
    </div>
    );
}