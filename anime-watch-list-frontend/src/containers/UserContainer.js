import React from 'react'
import NewUserForm from '../components/Account/NewUserForm';
import SignUp from '../components/Account/SignUp';

const UserContainer = () => {

    const [users, setUsers] = useState([]);

    useEffect(() => {
        fetch("http://localhost:8080/users")
        .then(response => response.json())
        .then(data => setUsers(data))
    }, []);
// POST USER
    const postUser = (newUser) => {
        fetch("http://localhost:8080/users", {
            method:"POST",
            headers: {"Content-Type": "application/json"},
            body:JSON.stringify(newUser)
        })
        .then(response => response.json())
        .then(savedUser => setUsers([...users, savedUser]))
    }
// // DELTE USER
//     const deleteUser = (id) => {
//         fetch("http://localhost:8080/users/" + id, {
//           method: "DELETE",
//           headers: {"Content-Type": "application/json"}
//         })
//         setUsers(users.filter(user => user.id !== id))
//       }



  return (
    <>
    {/* <SignUp postUser={postUser}/> */}
    {/* <NewUserForm postUser={postUser}/> */}
    </>
  )
}

export default UserContainer;