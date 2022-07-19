import SingleWatchList from "./SingleWatchList";
import { useState, useEffect } from 'react';
import "./WatchListPage.css"

const WatchLists = ({currentAnimeAcc}) => {


    const [watchListAnimes, setwatchListAnimes] = useState([]);

    const [userWatchListAnimes, setUserWatchListAnimes] = useState([])
    const [loggedInUser, setLoggedInUser] = useState()
    const [removeBtnState, setRemoveBtnState] = useState(false)
  
  



      //-------------------------Setting ANimes------------------------
  const [animes, setAnimes] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/animes")
      .then((response) => response.json())
      .then((animes) => {
        setAnimes(animes)
      })
  }, [])




      //-----------------------Setting users and user----------------------

    const [users, setUsers] = useState([]);
 
    useEffect(() => {
      fetch("http://localhost:8080/users")
        .then((response) => response.json())
        .then((users) => {
          setUsers(users)
          setLoggedInUser(currentAnimeAcc)
        })
    }, [])

     //--------------------------   Initially  Getting ALL Watchlists -------------

  // 
  let currentUsersWatchList = watchListAnimes.filter(eachWatchList => {
    return eachWatchList.user.name === loggedInUser.name
  })

  useEffect(() => {

    fetch("http://localhost:8080/watchLists")
      .then(data => data.json())
      .then(watchlists => {

        setwatchListAnimes(watchlists)
        // setUserWatchListAnimes(currentUsersWatchList)
        // setUserWatchListAnimes([...currentUsersWatchList])
      })

  }, [animes])

  useEffect(() => {
    setUserWatchListAnimes(currentUsersWatchList)
  }, [animes])


    // ------CallBack Ater Deleting Watchlist--------------




    async function deleteWatchList(watchlistId){
        console.log(watchlistId)
    
        async function deleteMappingUpdate() {
     
             fetch("http://localhost:8080/watchLists/" + watchlistId, {
              method: "DELETE"
      
            })
        }
    
        deleteMappingUpdate()
    
         function fetchUpdatedListAfterDelete() {
          setTimeout(() => {
            fetch("http://localhost:8080/watchLists/")
            .then(data => data.json())
            .then(updatedWatchList =>{
              let currentUsersWatchList = updatedWatchList.filter(eachWatchList => {
                return eachWatchList.user.name === loggedInUser.name
              })
              setUserWatchListAnimes(currentUsersWatchList)
              console.log(updatedWatchList)
        
            })
    
          }, 50)
        }
    
          fetchUpdatedListAfterDelete()
    
      }


      const eachWatchListAnime =  userWatchListAnimes.map(eachWatchList => {
        return <SingleWatchList key = {eachWatchList.id}
                                eachAnimeInWatchList ={eachWatchList.anime} 
                                deleteWatchList = {deleteWatchList}
                                watchListId = {eachWatchList.id}
                                userWatchListAnimes ={userWatchListAnimes}
                                setUserWatchListAnimes ={setUserWatchListAnimes}
 
                                />
 
     })



    
    return(
        <>
        <h1 className="watch-list-header">My WatchLists</h1>
        <div className="watchListContainer">
        {eachWatchListAnime}


        </div>
        </>
    )
}

export default WatchLists;