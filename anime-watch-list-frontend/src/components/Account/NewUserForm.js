import React from 'react'

const NewUserForm = ({postUser}) => {

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

    const handlePasswordShown = (event) => {
        event.preventDefault();
        setPasswordShown(!passwordShown);
      }


  return (
    <div className="sign-up-container">
    <form onSubmit={handleFormSubmit} className="sign-up-form">


      <h1 className="sign-up-title">Sign Up with</h1>
      <p className="sign-up-input-title">Your username</p>
      <input 
          type="text" 
          onChange={handleChange}
          className="sign-up-input-box"
          value={stateUser.name}/>
      <p className="new-user-username"></p>


      <p className="sign-up-input-title">Enter DOB (YYYY-MM-DD): 
      <br/>
        <input 
            type="text" 
            placeholder="date of birth" 
            name="dob" onChange={handleChange} 
            className="sign-up-input-box" 
            value={stateUser.dob}
        />
      </p>


      <p className="sign-up-input-title">Your Email</p>
      <input 
          type="text" 
          onChange={handleChange}
          className="sign-up-input-box"
          value={stateUser.email}/>
      <p className="new-user-email"></p>


      <p className="sign-up-input-title">Password</p>
      <input 
          type={passwordShown? "text" : "password"} 
          className="sign-up-input-box"
          onChange={handleChange}
          value={stateUser.password}/>
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
  )
}

export default NewUserForm;