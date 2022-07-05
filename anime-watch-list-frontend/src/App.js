// import demonSlayer from "./assets/demonSlayer.mp4";
// import animeAll from "./assets/animeAll.mp4";
// import zenitsu from "./assets/zenitsu.mp4";
import Home from "./components/Home";
import Explore from "./components/Explore/Explore";
import Account from "./components/Account/Account";
import './App.css';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import LoginPage from "./components/Account/Login";
import SigninForm from "./components/Account/SignUp";
import AnimeContainer from "./containers/AnimeContainers";
import usePersistedState from "./containers/usePersistedState";
import RenderedAnimeList from "./components/RenderedAnime/RenderedAnimeList";
<<<<<<< HEAD
import { React, useState } from "react";
=======
import { React } from "react";
import WatchLists from "./components/UserWatchList/WatchLists";
>>>>>>> main

function App() {
// is the user logged on - true or false
const [isLogin, setIsLogin] = usePersistedState('isLogin',false);
const [currentAnimeAcc, setCurrentAnimeAcc] = usePersistedState('currentAnimeAcc', {});

const [users, setUsers] = useState([]);
const postUser = (newUser) => {
    fetch("http://localhost:8080/users", {
        method:"POST",
        headers: {"Content-Type": "application/json"},
        body:JSON.stringify(newUser)
    })
    .then(response => response.json())
    .then(savedUser => setUsers([...users, savedUser]))
}

return (
    <Router>
        <div className="App">
        <AnimeContainer isLogin={isLogin} setIsLogin={setIsLogin}
                        currentAnimeAcc={currentAnimeAcc}
                        setCurrentAnimeAcc={setCurrentAnimeAcc}
                        />
            {/* <ul id="bar">
                <li><Link to='/home'>Home</Link></li>
                <li><Link to='/explore'>Explore</Link></li>
                <li><Link to='/account'>Account</Link></li>
                <li><Link to='/login'>Login</Link></li>
                <li><Link to='/signup'>Sign up</Link></li>
            </ul> */}

            <Routes>
                <Route path='/' element={<Home/>}/>
                <Route path='/home' element={<Home/>}/>
                <Route exact path='/explore/' element={<Explore/>}/>
                <Route exact path='/userWatchList' element={<WatchLists/>}/>
                <Route path='/account' element={isLogin? <Account currentAnimeAcc={currentAnimeAcc}
                                                                    setCurrentAnimeAcc={setCurrentAnimeAcc}/>: 
                                                        <SigninForm isLogin={isLogin} setIsLogin={setIsLogin}
                                                                currentAnimeAcc={currentAnimeAcc}
                                                                setCurrentAnimeAcc={setCurrentAnimeAcc} postUser={postUser}/>}/>
                <Route path='/login' element={<LoginPage isLogin={isLogin} setIsLogin={setIsLogin}
                                                            currentAnimeAcc={currentAnimeAcc}
                                                            setCurrentAnimeAcc={setCurrentAnimeAcc}/>}/>
                {/* <Route path='/signup' element={<SigninForm/>}/> */}
                <Route path='/explore/:animeName' element={<RenderedAnimeList/>}/>
            </Routes>
        </div>
    </Router>
        

        );
    }
    

export default App;
