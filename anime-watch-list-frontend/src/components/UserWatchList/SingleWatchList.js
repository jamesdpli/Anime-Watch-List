import "./SingleWatchList.css"

const SingleWatchList = ({ eachAnimeInWatchList,
    deleteWatchList,
    watchListId,
    setUserWatchListAnimes,
     }) => {


  

    const handleRemoveWatchList = () => {
        deleteWatchList(watchListId)





    }
    return (
        <>
            <div className="singleWatchList-container">

                <div className="image-container">
                    <img src={eachAnimeInWatchList.imageUrl}/>
                    </div>

                    <div className="anime-info-Container">

                        <div className="headerAndRemoveBtn-container">
                            <h2> {eachAnimeInWatchList.name}</h2>
                            <button onClick={handleRemoveWatchList}>X</button>
                        </div>

                        <div className="description">
                            <h4>{eachAnimeInWatchList.description}</h4>
                        </div>

                    </div>
            
               

            </div>
        </>
    )
}

export default SingleWatchList;