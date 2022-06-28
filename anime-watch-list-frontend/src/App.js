
import demonSlayer from "./assets/demonSlayer.mp4";
import animeAll from "./assets/animeAll.mp4";
// import TextField from "@mui/material/TextField";
// import { Button } from "@mui/material";
import zenitsu from "./assets/zenitsu.mp4";
import './App.css';
// add usPersistedState
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';

function App() {
  // const [isLogin, setIsLogin] = usePersistedState('isLogin',false);
  // const [currentPodCastAcc, setCurrentPodCastAcc] = usePersistedState('currentPodCastAcc', {});

  return (

    <Router>

<Route path='/account' element={isLogin? <Account currentPodCastAcc={currentPodCastAcc}
                                                            setCurrentPodCastAcc={setCurrentPodCastAcc}/>: 
                                                  <SignUp isLogin={isLogin} setIsLogin={setIsLogin}
                                                          currentPodCastAcc={currentPodCastAcc}
                                                          setCurrentPodCastAcc={setCurrentPodCastAcc} />}>

                <Route path='recommended' element={<RecommendList currentPodCastAcc={currentPodCastAcc} 
                                                                  setCurrentPodCastAcc={setCurrentPodCastAcc}/>} />
                <Route path='watched' element={<WatchedEpisodeList currentPodCastAcc={currentPodCastAcc}
                                                                  setCurrentPodCastAcc={setCurrentPodCastAcc}/>}/>


          </Route>

      <div className="App">
      <Routes>
      <Route path='/login' element={<Login isLogin={isLogin} setIsLogin={setIsLogin}
                                              currentPodCastAcc={currentPodCastAcc}
                                              setCurrentPodCastAcc={setCurrentPodCastAcc}/>}>
          </Route>
        </Routes>
        </div>
    </Router>

    
  );
}

export default App;
