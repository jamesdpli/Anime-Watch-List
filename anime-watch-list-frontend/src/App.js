
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import AnimeContainer from './containers/AnimeContainer';
import WatchedEpisodeList from './components/WatchedEpisodeList';

// import TextField from "@mui/material/TextField";
// import { Button } from "@mui/material";
// import zenitsu from "./assets/zenitsu.mp4";
import './App.css';
import usePersistedState from './components/usePersistedState';

import Home from "./containers/Home";
import Cover from "./containers/Cover";
import Login from "./containers/Login";
import SignUp from "./containers/SignUp";
import Explore from "./containers/Explore";
import Account from './containers/Account';

function App() {
  const [isLogin, setIsLogin] = usePersistedState('isLogin',false);
  const [currentAnimeAcc, setCurrentAnimeAcc] = usePersistedState('currentAnimeAcc', {});

  return (

    <Router>
    <div className="App">
      
        <AnimeContainer isLogin={isLogin} setIsLogin={setIsLogin}
                          currentAnimeAcc={currentAnimeAcc}
                          setCurrentAnimeAcc={setCurrentAnimeAcc} />
        <Routes>
          <Route path='/home' element={<Home/>}></Route>
          <Route path='/' element={<Cover/>}/>
          <Route path='/explore' element={<Explore isLogin={isLogin} currentAnimeAcc={currentAnimeAcc}/>}>
          </Route>
          <Route path='/account' element={isLogin? <Account currentAnimeAcc={currentAnimeAcc}
                                                            setCurrentAnimeAcc={setCurrentAnimeAcc}/>: 
                                                  <SignUp isLogin={isLogin} setIsLogin={setIsLogin}
                                                          currentAnimeAcc={currentAnimeAcc}
                                                          setCurrentAnimeAcc={setCurrentAnimeAcc} />}>
                <Route path='watched' element={<WatchedEpisodeList currentAnimeAcc={currentAnimeAcc}
                                                                  setCurrentAnimeAcc={setCurrentAnimeAcc}/>}/>


          </Route>

          <Route path='/login' element={<Login isLogin={isLogin} setIsLogin={setIsLogin}
                                              currentAnimeAcc={currentAnimeAcc}
                                              setCurrentAnimeAcc={setCurrentAnimeAcc}/>}>
          </Route>
        </Routes>

    </div>
    </Router>

    
  );
}

export default App;
