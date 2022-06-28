const Signup = ({isLogin, setIsLogin, currentPodCastAcc, setCurrentPodCastAcc}) => {

    const inputNewEmail = useRef();
    const inputNewPassword = useRef();
    const inputNewUsername = useRef();
    const [allUsers, setAllUsers] = useState();
    const [passwordShown, setPasswordShown] = useState(false);
    const [allowedSignup, setAllowedSignup] = useState([false, false, false]);

    console.log(allowedSignup);
    // to get all the users on the site
    useEffect(() => {
        fetch("//http://localhost:8080/users")
            .then(response => response.json())
            .then(data => setAllUsers(data))
    }, [])

    // Creating a new user with post mapping
    const handleSignUp = (event) => {
        event.preventDefault();

        if (allowedSignup.includes(false)) return;

        const newAnimeUser = {
            username: inputNewUsername.current.value,
            password: inputNewPassword.current.value,
            email: inputNewEmail.current.value,
            admin: false
        };

        fetch("http://localhost:8080/users",
            {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(newAnimeUser)
            })
            .then(response => response.json())
            .then(savedAnimeUser => setCurrentAnimeAcc(savedAnimeUser))
        setIsLogin(!isLogin);

    }

    // Checking if the username already exists
    const handleExisitedUserName = () => {

        const allUserNames = allUsers.map(user => { return user.username; });

        // initalising a checker with index 0
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

    // check if it is the right format of email address
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

    
    return(<></>);
}

export default Signup;