import "./loginPage.css";
// import animeAll from "../FirstPage/animeAll.mp4";
import SigninForm from "./SigninForm";
// import demonSlayer from "../assets/demonSlayer.mp4";
// import zenitsu from "../FirstPage/zenitsu.mp4";

const LoginPage = () => {
  return (
    <div className="main-login">
      <div className="overlay-login"></div>
      {/* <video src={demonSlayer} autoPlay loop muted /> */}
      <SigninForm />
    </div>
  );
};
export default LoginPage;
