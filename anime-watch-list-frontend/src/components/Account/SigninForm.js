import TextField from "@mui/material/TextField";
// import VisibilityOffIcon from "@mui/icons-material/VisibilityOff";
import Button from "@mui/material/Button";
import { Link } from "react-router-dom";
import "./signInForm.css";
import { red } from "@mui/material/colors";

const SigninForm = () => {
  return (
    <div className="content-signin">
      <div className="form-border">
        {" "}
        <h1 className="header-signin">
          Sign in{" "}
          <img
            className="logo"
            src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Apple_Computer_Logo_rainbow.svg/1757px-Apple_Computer_Logo_rainbow.svg.png"
            style={{
              width: "45px",
              height: "45px",
            }}
            alt="logo"
          />
        </h1>{" "}
        <br />
        <TextField
          label="Email address"
          required
          style={{
            color: "white",
            backgroundColor: "#333",
            width: "400px",
          }}
          InputLabelProps={{style : {color : 'white'} }}
        />{" "}
        <br /> <br /> <br />
        <TextField
          label="Password"
          type="password"
          required
          style={{
            color: "white",
            backgroundColor: "#333",
            width: "400px",
          }}
          InputLabelProps={{style : {color : 'white'} }}
        ></TextField>
        <br />
        <br /> 
        <br />
        <Button
          style={{
            borderRadius: 5,
            backgroundColor: "red",
            fontSize: "20px",
            color: "white",
            width: "400px",
          }}
        >
          Sign in
        </Button>
      </div>
      
    </div>
  );
};

export default SigninForm;
