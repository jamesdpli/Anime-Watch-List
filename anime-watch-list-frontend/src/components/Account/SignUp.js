// import VisibilityOffIcon from "@mui/icons-material/VisibilityOff";
import "./SignUp.css";
import "./Login.css";
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

      const newUser = {
          username: inputNewUsername.current.value,
          password: inputNewPassword.current.value,
          email: inputNewEmail.current.value,
      };

    
      // POSTing the new user data into the db -- this does not function replaced xAnimeUser to xUser
      fetch("http://localhost:8080/users",
            {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(newUser)
            })
            .then(response => response.json())
            .then(savedUser => setCurrentAnimeAcc(savedUser))
        setIsLogin(!isLogin);
      }

      // Add an account and password checker with an action to say if it is wrong
      const handleExisitedUserName = () => {
        const allUserNames = allUsers.map(user => { return user.username; });
        // initialise a checker, index 0
        let userNameChecker = [false, allowedSignup[1], allowedSignup[2]];
        if (allUserNames.includes(inputNewUsername.current.value)) {
            document.querySelector('.new-user-username-input').innerHTML = "This username already exists";

            // didn't pass the username checker
            setAllowedSignup(userNameChecker);

        }
        else {
            document.querySelector('.new-user-username-input').innerHTML = "";

            // pass username checker
            userNameChecker = [true, allowedSignup[1], allowedSignup[2]];
            setAllowedSignup(userNameChecker);

        }

    }

    const handleCorrectEmail = () => {
      // initialise a checker, index 1
      let userEmailChecker = [allowedSignup[0], false, allowedSignup[2]];

      if (!inputNewEmail.current.value.includes("@")) {
          document.querySelector('.new-user-email-input').innerHTML = "Please put in the correct email"

          // didn't pass the email checker
          setAllowedSignup(userEmailChecker);
      }
      else {
          document.querySelector('.new-user-email-input').innerHTML = "";

          // pass email checker
          userEmailChecker = [allowedSignup[0], true, allowedSignup[2]];
          setAllowedSignup(userEmailChecker);

      }
  }

      // To show password or not
      const handlePasswordShown = (event) => {
        event.preventDefault();
        setPasswordShown(!passwordShown);
      }

  return (
    <div>
      <form className="box-form-1">
        <div className="left">
          <div className="overlay1">
            <h1>Join us</h1>
            <h1>today!</h1>
          </div>
        </div>
        
        <div className="right">
          <h1>Sign Up here</h1>
          <br/>

          <p className="sign-up-input-title">Your username</p>
        <input type="text" ref={inputNewUsername} onChange={handleExisitedUserName} className="sign-up-input-box-1"/>
        <p className="new-user-username"></p>

        <p className="sign-up-input-title">Your Email</p>
        <input type="text" ref={inputNewEmail} onChange={handleCorrectEmail} className="sign-up-input-box-1"/>
        <p className="new-user-email"></p>

        <p className="sign-up-input-title">Password</p>
        <input type={passwordShown? "text" : "password"} ref={inputNewPassword} className="sign-up-input-box-1"/><br/>
        <button onClick={handlePasswordShown} className="password-shown-button">{passwordShown ? <AiOutlineEye className="password-eye" /> : <AiOutlineEyeInvisible className="password-eye" />}</button>
        <p className="new-user-password"></p>
        <br/>

        <button onClick={handleSignUp} className='sign-up-btn'>Sign up</button>

        <p>Do you already have an account? <br/><a href="/login" className="link-text-tag">Log in</a></p>
        </div>
        

        {/* <input type="checkbox" id='sign-up-condition-box' className='sign-up-terms-box' />
        <label htmlFor="sign-up-condition-box" >I agree to terms & conditions.</label>
        <br /> */}
      </form>
    </div>
  );
};

export default SignUp;
