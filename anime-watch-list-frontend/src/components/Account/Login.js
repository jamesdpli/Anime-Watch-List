import "./SignUp.css";
import { Link, useNavigate } from "react-router-dom";
import { BsTwitter } from "react-icons/bs";
import { useRef, useState, useEffect } from "react";
import {AiOutlineEye, AiOutlineEyeInvisible} from "react-icons/ai"
// import animeAll from "../FirstPage/animeAll.mp4";
// import demonSlayer from "../assets/demonSlayer.mp4";
// import zenitsu from "../FirstPage/zenitsu.mp4";

const Login = ({isLogin, setIsLogin, setCurrentAnimeAcc}) => {

  const navigate = useNavigate();
  const inputEmail = useRef();
  const inputPassword = useRef();
  const [allUsers, setAllUsers] = useState ([]);
  const [passwordShown, setPasswordShown] = useState(false);

  useEffect(()=>{
    fetch("http://localhost:8080/users")
    .then(response => response.json())
    .then(data => setAllUsers(data))
    },[]);

    const handleLogin = (event) =>{
      const currentUser = allUsers.filter(user => user.email == inputEmail.current.value &&
        user.password == inputPassword.current.value);
        
        if (currentUser.length == 0) {
          alert("Invalid email adress or password! Please try again!")
          return
        };

        setCurrentAnimeAcc(currentUser[0]);
        setIsLogin(!isLogin);
        navigate('/explore');
        }

        // to show the password or not
        const handlePasswordShown = (event) => {
          event.preventDefault();
          setPasswordShown(!passwordShown);
      }

  return (
    <div className="sign-up-container">
      <form className="sign-up-form">
        <h1 className="login-title">Login with</h1>
        {/* <div className="other-sign-up">
          <ul>
            <li className="button-a-tag"><button><BsTwitter/></button></li>
          </ul>
        </div>
        <p className="or-line"><span>Or</span></p>
        <br/> */}

        <p className="sign-up-input-title">Your Email</p>
        <input type="text" ref={inputEmail} className="sign-up-input-box"/>
        <p className="new-user-email"></p>

        <p className="sign-up-input-title">Password</p>
        <input type={passwordShown? "text" : "password"} ref={inputPassword} className="sign-up-input-box"/><br/>
        <button onClick={handlePasswordShown} className="password-shown-button">{passwordShown? <AiOutlineEye className="password-eye"/> : <AiOutlineEyeInvisible className="password-eye"/>}</button>
        <p className="new-user-password"></p>
        <br/>

        <a href="#" className="link-a-tag">Log in as Admin?</a>
        <br/>

        <a href="#" className="link-a-tag">Forget your password?</a>
        <br/>

        <div>
        <br/>
        <button onClick={handleLogin}className='sign-up-btn'>Log in</button>
        </div>
        <p>Do you need an account? <a href="/signup" className="link-a-tag">Create new account</a></p>
      </form>
    </div>
  );
};
export default Login;
