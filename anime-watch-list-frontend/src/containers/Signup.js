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
    return(<></>);
}

export default Signup;