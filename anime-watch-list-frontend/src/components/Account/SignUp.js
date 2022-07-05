// import VisibilityOffIcon from "@mui/icons-material/VisibilityOff";
import "./SignUp.css";

import "./Login.css";

import { useRef, useState } from "react";

import { AiOutlineEye, AiOutlineEyeInvisible } from "react-icons/ai";
// import React, {useState} from "react";
// import {BsTwitter} from 'react-icons/bs'; // npm install react-icons


const SignUp = ({postUser}) => {

    const [allowedSignup, setAllowedSignup] = useState([false, false, false]);
    

  const [passwordShown, setPasswordShown] = useState(false);
  const[stateUser, setStateUser] = useState({
    name: "",
    dob: "",
    email: "",
    password: "",
    watchLists: []
  });


  const handleChange = (event) => {
    console.log(event);
    let userName = event.target.name;
    let copiedUser = {...stateUser}
    copiedUser[userName] = event.target.value;
    setStateUser(copiedUser);
  }
  
  const handleFormSubmit = (event) => {
    event.preventDefault();
    postUser(stateUser);
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
            <h1>Join Us</h1>
            <h1>today!</h1>
            <br/>
            <p>Be part of a big community!</p>
          </div>
        </div>
        
        <div className="right">
          <h1>Sign Up here</h1>
          <br/>

          <p className="sign-up-input-title"></p>
          <input type="text" placeholder="Name" name="name" onChange={handleChange} value={stateUser.name}  className="sign-up-input-box-1"/>
        <p className="new-user-username"></p>

        <p className="sign-up-input-title"> 
        <br/>
          <input 
            type="text" 
            placeholder="Enter DOB (YYYY-MM-DD)" 
            name="dob" 
            onChange={handleChange} 
            className="sign-up-input-box-1" 
            value={stateUser.dob}
          />
        </p>

        <p className="sign-up-input-title"></p>
        <br/>
        <input type="text" placeholder="Email" name="email" onChange={handleChange} value={stateUser.email} className="sign-up-input-box-1"/>
        <p className="new-user-email"></p>

        <p className="sign-up-input-title"></p>
        <br/>
        <input type={passwordShown? "text" : "password"} placeholder="Password" name="password" onChange={handleChange} value={stateUser.password} className="sign-up-input-box-1"/>
        <button onClick={handlePasswordShown} className="password-shown-button">{passwordShown ? <AiOutlineEye className="password-eye" /> : <AiOutlineEyeInvisible className="password-eye" />}</button>
        <p className="new-user-password"></p>
        <br/>

        <button className='sign-up-btn'>Sign up</button><br/><br/>
        <p>Do you already have an <a href="/login">account</a>?</p>
        </div>
        

        {/* <input type="checkbox" id='sign-up-condition-box' className='sign-up-terms-box' />
        <label htmlFor="sign-up-condition-box" >I agree to terms & conditions.</label>
        <br /> */}
      </form>
    </div>
  );
};

export default SignUp;
