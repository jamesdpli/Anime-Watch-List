// import VisibilityOffIcon from "@mui/icons-material/VisibilityOff";
import "./SignUp.css";
// import React, {useState} from "react";
// import {BsTwitter} from 'react-icons/bs'; // npm install react-icons


const SignUp = () => {
  return (
    <div className="sign-up-container">
      <form className="sign-up-form">
        <h1 className="sign-up-title">Sign up with</h1>
        {/* <div className="other-sign-up">
          <ul>
            <li className="button-a-tag"><button><BsTwitter/></button></li>
          </ul>
        </div>
        <p className="or-line"><span>Or</span></p>
        <br/> */}
        <p className="sign-up-input-title">Your username</p>
        <input type="text" className="sign-up-input-box"/>
        <p className="new-user-username"></p>

        <p className="sign-up-input-title">Your Email</p>
        <input type="text" className="sign-up-input-box"/>
        <p className="new-user-email"></p>

        <p className="sign-up-input-title">Password</p>
        <input type="text" className="sign-up-input-box"/>
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
