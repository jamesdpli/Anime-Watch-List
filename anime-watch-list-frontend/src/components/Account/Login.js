// import "./SignUp.css";
import { Link, useNavigate } from "react-router-dom";
import { BsTwitter } from "react-icons/bs";
import { useRef, useState, useEffect } from "react";
import {AiOutlineEye, AiOutlineEyeInvisible} from "react-icons/ai"
// import animeAll from "../FirstPage/animeAll.mp4";
// import demonSlayer from "../assets/demonSlayer.mp4";
// import zenitsu from "../FirstPage/zenitsu.mp4";
import "./Login.css";
import "./SignUp";


const Login = ({isLogin, setIsLogin, setCurrentAnimeAcc}) => {

  const navigate = useNavigate();
  const inputEmail = useRef();
  const inputPassword = useRef();
  const [allUsers, setAllUsers] = useState ([]);
  const [passwordShown, setPasswordShown] = useState(false);

  // Getting all the users
  useEffect(()=>{
    fetch("http://localhost:8080/users")
    .then(response => response.json())
    .then(data => setAllUsers(data))
    },[]);

    // to check if the email + password are the same in the dataloader -- alert will state if it is wrong
    const handleLogin = (event) =>{
      console.log(event)
      const currentUser = allUsers.filter(user => user.email == inputEmail.current.value &&
        user.password == inputPassword.current.value);
        
        if (currentUser.length == 0) {
          alert("Invalid email address or password! Please try again!")
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
    <div className="login-form-container"> 
      <form className="box-form">
        <div className="left">
          <div className="overlay1">
            <h1>Welcome Back</h1>
            {/* <p> </p> */}
          </div>
        </div>

        <div className="right">
        <h1>Login with</h1>

        <br/>
        <br/>
        <p>Don't have an account? <Link to="/account"> Create Your Account</Link> it takes less than a minute</p>

        <div className="inputs">

        <p className="sign-up-input-title"></p>
        <br/>
        <input type="text" ref={inputEmail} placeholder="Email" className="sign-up-input-box"  />
        <p className="new-user-email"></p>

        <p className="sign-up-input-title"></p>
        <br/>
        <input type={passwordShown? "text" : "password"}  placeholder="Password" ref={inputPassword} className="sign-up-input-box" /><br/>
        <button 
            onClick={handlePasswordShown} 
            className="password-shown-button-1">{passwordShown ? <AiOutlineEye className="password-eye-1" /> : <AiOutlineEyeInvisible className="password-eye-1" />}</button>
        <p className="new-user-password"></p>
  
        </div>
        
        <div className="remember-me">

        <span className="click-me">Remember me  <input type="checkbox" className='click-me'/> </span>
        
            <br/>
            

            <p>forget password?</p>
        </div>
          <br/>
          <button onClick={handleLogin}className='sign-up-btn1'>Log in</button>
        </div>
        </form>

        

        

        {/* Should an admin login page be made? -- backend must add boolean whether user is an admin or not */}
        {/* <a href="#" className="link-a-tag">Log in as Admin?</a>
        <br/> */}

        {/* Authentication -- extension */}
        {/* <a href="#" className="link-a-tag">Forget your password?</a>
        <br/> */}

        {/* <div>
        <br/> */}
        
        {/* </div>
        <p>Do you need an account? <a href="/account" className="link-a-tag">Create new account</a></p> */}
    </div>
  );
};
export default Login;
