import "./SignUp.css";
import { BsTwitter } from "react-icons/bs";
// import animeAll from "../FirstPage/animeAll.mp4";
// import demonSlayer from "../assets/demonSlayer.mp4";
// import zenitsu from "../FirstPage/zenitsu.mp4";

const Login = () => {
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
        <p className="or-line"><span>Or</span></p>
        <br/>

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

        <p>Do you already have an account? <a href="/login">Log in</a></p>
      </form>
    </div>
  );
};
export default Login;
