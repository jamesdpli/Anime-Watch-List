import TextField from "@mui/material/TextField";
// import VisibilityOffIcon from "@mui/icons-material/VisibilityOff";
import Button from "@mui/material/Button";
import { Link } from "react-router-dom";
import "./SignUp.css";
import { red } from "@mui/material/colors";

import React, {useState} from "react";
import {BsTwitter} from 'react-icons/bs'; // npm install react-icons


const SignUp = () => {
  return (
    <div className="sign-up-container">
      <form className="sign-up-form">
        <h1 className="sign-up-title">Sign up with</h1>
        <div className="other-sign-up">
          <ul>
            <li className="button-a-tag"><button><BsTwitter/></button></li>
            {/* add more icon buttons */}
          </ul>
        </div>
      </form>
    </div>
  );
};

export default SignUp;
