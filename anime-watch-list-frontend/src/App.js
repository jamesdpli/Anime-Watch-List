
import demonSlayer from "./assets/demonSlayer.mp4";
import animeAll from "./assets/animeAll.mp4";
// import TextField from "@mui/material/TextField";
// import { Button } from "@mui/material";
import zenitsu from "./assets/zenitsu.mp4";
import './App.css';
// add usPersistedState
// import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';

import Home from "./containers/Home";
import Cover from "./containers/Cover";
import Login from "./containers/Login";
import Signup from "./containers/Signup";
import Explore from "./containers/Explore";

function App() {
  // const [isLogin, setIsLogin] = usePersistedState('isLogin',false);
  // const [currentPodCastAcc, setCurrentPodCastAcc] = usePersistedState('currentPodCastAcc', {});

  return (

    <Router>
        <Routes>
        <Route path='/home' element={<Home/>}></Route>
          <Route path='/' element={<Cover/>}/>
          <Route path='/explore' element={<Explore isLogin={isLogin} currentAnimeAcc={currentAnimeAcc}/>}></Route>
          <Route path='/account' element={isLogin? <Account currentAnimeAcc={currentAnimeAcc}
                                                            setCurrentAnimeAcc={setCurrentAnimeAcc}/>: 
                                                  <SignUp isLogin={isLogin} setIsLogin={setIsLogin}
                                                          currentAnimeAcc={currentAnimeAcc}
                                                          setCurrentAnimeAcc={setCurrentAnimeAcc} />}>

                <Route path='recommended' element={<RecommendList currentAnimeAcc={currentAnimeAcc} 
                                                                  setCurrentAnimeAcc={setCurrentAnimeAcc}/>} />
                <Route path='watched' element={<WatchedEpisodeList currentAnimeAcc={currentAnimeAcc}
                                                                  setCurrentAnimeAcc={setCurrentAnimeAcc}/>}/>
          </Route>

      <div className="App">
      <Routes>
      <Route path='/login' element={<Login isLogin={isLogin} setIsLogin={setIsLogin}
                                              currentAnimeAcc={currentAnimeAcc}
                                              setCurrentAnimeAcc={setCurrentAnimeAcc}/>}>
          </Route>
        </Routes>
        </div>
      </Routes>
    </Router>

    
  );
}

export default App;
