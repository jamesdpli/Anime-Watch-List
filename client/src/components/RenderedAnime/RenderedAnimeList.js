import { useState, useEffect } from "react";
import RenderedAnime from "./RenderedAnime"

const RenderedAnimeList = ({currentAnimeAcc}) => {
  const [renderedAnime, setRenderedAnime] = useState([]);

  useEffect(() => {
    setTimeout(() =>{
      fetch("http://localhost:8080/animes")
      .then((response) => response.json())
      .then((data) => setRenderedAnime(data));

    }, 200)

   
  }, []);

  // useEffect(() => {
  //   console.log(renderedAnime)

  

  // }, [renderedAnime]);


  const [watchListAnimes, setwatchListAnimes] = useState([]);
  const [userWatchListAnimes, setUserWatchListAnimes] = useState([])
  const [loggedInUser, setLoggedInUser] = useState()

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
  let currentUsersWatchList = setTimeout(() =>{
    watchListAnimes.filter(eachWatchList => {
      return eachWatchList.user.name === loggedInUser.name
  }) 
  }, 250)

  useEffect(() => {


    fetch("http://localhost:8080/watchLists")
      .then(data => data.json())
      .then(watchlists => {

        setwatchListAnimes(watchlists)
        // setUserWatchListAnimes(currentUsersWatchList)
        // setUserWatchListAnimes([...currentUsersWatchList])
      })

  }, [renderedAnime])

  useEffect(() => {
    setUserWatchListAnimes(currentUsersWatchList)
  }, [renderedAnime])



  //----------------------POSTING WATCHLIST ----------------------------------


  async function addToWatchList(userAndAnime) {
   await fetch("http://localhost:8080/watchLists", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(userAndAnime)
    })

      .then(data => data.json())
      .then(newWatchList => {

        setUserWatchListAnimes([...userWatchListAnimes, newWatchList])
      })
  }


  //------------------------Deleting WachList--------------------------



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

      }, 200)
   
        
    }

      fetchUpdatedListAfterDelete()
  }
  

  return (
    <>
      <RenderedAnime  renderedAnime={renderedAnime} 
                     loggedInUser={loggedInUser} 
                     addToWatchList ={addToWatchList}/> 
    </>
  );
};


export default RenderedAnimeList