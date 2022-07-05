import "./SignUp.css";
import { Link, useNavigate } from "react-router-dom";
import { BsTwitter } from "react-icons/bs";
import { useRef, useState, useEffect } from "react";
import {AiOutlineEye, AiOutlineEyeInvisible} from "react-icons/ai"
// import animeAll from "../FirstPage/animeAll.mp4";
// import demonSlayer from "../assets/demonSlayer.mp4";
// import zenitsu from "../FirstPage/zenitsu.mp4";
import "./Login.css";

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
    <div> 
      <form className="box-form">
        <div className="left">
          <div className="overlay1">
            <h1>Hello there!</h1>
            <p> Are you ready to make lists? </p>
          </div>
        </div>

        <div className="right">
        <h1>Login with</h1>
        <br/>
        <p>Don't have an account? <a href="/account"> Create Your Account</a> it takes less than a minute</p>
        <div className="inputs">

        <p className="sign-up-input-title"></p>
        <br/>
        <input type="text" ref={inputEmail} placeholder="Email" className="sign-up-input-box-1"/>
        <p className="new-user-email"></p>

        <p className="sign-up-input-title"></p>
        <br/>
        <input type={passwordShown? "text" : "password"} ref={inputPassword} placeholder="Password" className="sign-up-input-box-1"/><br/>
        <button onClick={handlePasswordShown} className="password-shown-button-1">{passwordShown ? <AiOutlineEye className="password-eye-1" /> : <AiOutlineEyeInvisible className="password-eye-1" />}</button>

        <p className="new-user-password"></p>
        <br/>
        </div>
        <br></br>
        <div className="remember-me">
            {/* <input type="checkbox" name="item" checked/> */}
            <input type="checkbox" id='sign-up-condition-box' className='sign-up-terms-box' />
            <span class="text-checkbox1">Remember me</span>

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
