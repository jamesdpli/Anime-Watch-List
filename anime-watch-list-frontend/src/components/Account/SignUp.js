// import VisibilityOffIcon from "@mui/icons-material/VisibilityOff";
import "./SignUp.css";
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
    <div className="sign-up-container">
      <form onSubmit={handleFormSubmit} className="sign-up-form">
        <h1 className="sign-up-title">Sign Up with</h1>

      <p className="sign-up-input-title">Your name <br/> 
        <input type="text"  name="name" onChange={handleChange} value={stateUser.name}  className="sign-up-input-box"
        />
      </p>

        <p className="sign-up-input-title">Enter DOB (YYYY-MM-DD): 
        <br/>
          <input 
            type="text"  
            name="dob" 
            onChange={handleChange} 
            className="sign-up-input-box" 
            value={stateUser.dob}
          />
        </p>

      <p className="sign-up-input-title">Enter email: 
        <br/> 
        <input type="text" placeholder="email" name="email" onChange={handleChange} value={stateUser.email} className="sign-up-input-box"/>
      </p>

        <p className="sign-up-input-title">Set password: </p>
       
        <input type={passwordShown? "text" : "password"} placeholder="new password" name="password" onChange={handleChange} value={stateUser.password} className="sign-up-input-box"   
        />
        <br/>
      
          
        <button 
            onClick={handlePasswordShown} 
            className="password-shown-button">{passwordShown ? <AiOutlineEye className="password-eye" /> : <AiOutlineEyeInvisible className="password-eye" />}</button>
        <p className="new-user-password"></p>
        <br/>


        <input 
            type="checkbox" 
            id='sign-up-condition-box' 
            className='sign-up-terms-box' />
        <label htmlFor="sign-up-condition-box" >I agree to terms & conditions.</label>
        <br />
        <button className='sign-up-btn'>Sign up</button>

        <p>Do you already have an account? <br/><a href="/login" className="link-text-tag">Log in</a></p>
      </form>
    </div>
  );
};

export default SignUp;
