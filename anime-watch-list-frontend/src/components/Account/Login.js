import "./SignUp.css";
import { BsTwitter } from "react-icons/bs";
// import animeAll from "../FirstPage/animeAll.mp4";
// import demonSlayer from "../assets/demonSlayer.mp4";
// import zenitsu from "../FirstPage/zenitsu.mp4";

const Login = () => {
  return (
    <div className="sign-up-container">
      <form className="sign-up-form">
        <h1 className="sign-up-title">Login with</h1>
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

        <a href="#" className="link-a-tag">Log in as Admin?</a>
        <br/>

        <a href="#" className="link-a-tag">Forget your password?</a>
        <br/>

        <div>
        <br/>
        <button className='sign-up-btn'>Log in</button>
        </div>
        <p>Do you need an account?<a href="/account" className="link-a-tag">Create new account</a></p>
      </form>
    </div>
  );
};
export default Login;
