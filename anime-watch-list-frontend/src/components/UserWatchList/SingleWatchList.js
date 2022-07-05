const SingleWatchList = ({ eachAnimeInWatchList,
    deleteWatchList,
    watchListId,
    setRemoveBtnState,
    removeBtnState,
    setUserWatchListAnimes,
     }) => {


  

    const handleRemoveWatchList = () => {
        setRemoveBtnState(!removeBtnState)
        deleteWatchList(watchListId)





    }
    return (
        <>
            <div className="singleWatchList">
                <h4>{eachAnimeInWatchList.name}</h4>
                <button onClick={handleRemoveWatchList} className="removeWatchList"> remove </button>

            </div>
        </>
    )
}

export default SingleWatchList;