// import VisibilityOffIcon from "@mui/icons-material/VisibilityOff";
import "./SignUp.css";
import { useRef, useState, useEffect } from "react";
import { AiOutlineEye, AiOutlineEyeInvisible } from "react-icons/ai";
// import React, {useState} from "react";
// import {BsTwitter} from 'react-icons/bs'; // npm install react-icons


const SignUp = ({isLogin, setIsLogin, setCurrentAnimeAcc}) => {

    const inputNewEmail = useRef();
    const inputNewPassword = useRef();
    const inputNewUsername = useRef();
    const [allUsers, setAllUsers] = useState();
    const [passwordShown, setPasswordShown] = useState(false);
    const [allowedSignup, setAllowedSignup] = useState([false, false, false]);

    // Getting all users
    console.log(allowedSignup);
    useEffect(() => {
      fetch("http://localhost:8080/users")
          .then(response => response.json())
          .then(data => setAllUsers(data))
  }, []);

    // POST Mapping for creating a new user --- can change 
    const handleSignUp = (event) => {
      event.preventDefault();

      if (allowedSignup.includes(false)) return;


      const newAnimeUser = {
          username: inputNewUsername.current.value,
          password: inputNewPassword.current.value,
          email: inputNewEmail.current.value,
      };

    
      // POSTing the new user data into the db
      fetch("http://localhost:8080/users",
            {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(newAnimeUser)
            })
            .then(response => response.json())
            .then(savedAnimeUser => setCurrentAnimeAcc(savedAnimeUser))
        setIsLogin(!isLogin);
      }

      // Add an account and password checker with an action to say if it is wrong

      // To show password or not
      const handlePasswordShown = (event) => {
        event.preventDefault();
        setPasswordShown(!passwordShown);
      }

  return (
    <div className="sign-up-container">
      <form className="sign-up-form">
        <h1 className="sign-up-title">Sign Up with</h1>
        {/* <div className="other-sign-up">
          <ul>
            <li className="button-a-tag"><button><BsTwitter/></button></li>
          </ul>
        </div>
        <p className="or-line"><span>Or</span></p>
        <br/> */}
        <p className="sign-up-input-title">Your username</p>
        <input type="text" ref={inputNewUsername} className="sign-up-input-box"/>
        <p className="new-user-username"></p>

        <p className="sign-up-input-title">Your Email</p>
        <input type="text" ref={inputNewEmail} className="sign-up-input-box"/>
        <p className="new-user-email"></p>

        <p className="sign-up-input-title">Password</p>
        <input type={passwordShown? "text" : "password"} ref={inputNewPassword} className="sign-up-input-box"/><br/>
        <button onClick={handlePasswordShown} className="password-shown-button">{passwordShown ? <AiOutlineEye className="password-eye" /> : <AiOutlineEyeInvisible className="password-eye" />}</button>
        <p className="new-user-password"></p>
        <br/>

        <input type="checkbox" id='sign-up-condition-box' className='sign-up-terms-box' />
        <label htmlFor="sign-up-condition-box" >I agree to terms & conditions.</label>
        <br />

        <button className='sign-up-btn'>Sign up</button>

        <p>Do you already have an account? <br/><a href="/login" className="link-text-tag">Log in</a></p>
      </form>
    </div>
  );
};

export default SignUp;
