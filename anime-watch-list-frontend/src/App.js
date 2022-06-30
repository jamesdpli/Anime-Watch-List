// import demonSlayer from "./assets/demonSlayer.mp4";
// import animeAll from "./assets/animeAll.mp4";
// import zenitsu from "./assets/zenitsu.mp4";
import Home from "./components/Home";
import Explore from "./components/Explore";
import Account from "./components/Account/Account";
import './App.css';
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import LoginPage from "./components/Account/Login";
import SigninForm from "./components/Account/SignUp";

function App() {
return (
    <Router>
        <div className="App">
            <ul id="bar">
                <li><Link to='/home'>Home</Link></li>
                <li><Link to='/explore'>Explore</Link></li>
                <li><Link to='/account'>Account</Link></li>
                <li><Link to='/login'>Login</Link></li>
                <li><Link to='/signin'>Sign in</Link></li>
            </ul>

            <Routes>
                <Route path='/home' element={<Home/>}/>
                <Route path='/explore' element={<Explore/>}/>
                <Route path='/account' element={<Account/>}/>
                <Route path='/login' element={<LoginPage/>}/>
                <Route path='/signin' element={<SigninForm/>}/>
            </Routes>
        </div>
    </Router>
        

        );
    }
    

export default App;
