import SingleWatchList from "./SingleWatchList";

const WatchLists = ({userWatchListAnimes, setUserWatchListAnimes, deleteWatchList, removeBtnState, setRemoveBtnState}) => {

    const eachWatchListAnime =  userWatchListAnimes.map(eachWatchList => {
       return <SingleWatchList key = {eachWatchList.id}
                               eachAnimeInWatchList ={eachWatchList.anime} 
                               deleteWatchList = {deleteWatchList}
                               watchListId = {eachWatchList.id}
                               removeBtnState ={removeBtnState}
                               setRemoveBtnState ={setRemoveBtnState}
                               userWatchListAnimes ={userWatchListAnimes}
                               setUserWatchListAnimes ={setUserWatchListAnimes}

                               />

    })



    
    return(
        <>
        {eachWatchListAnime}
        </>
    )
}

export default WatchLists;