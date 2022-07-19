// import axios from 'axios';

// const instance = axios.create({
//     baseURL: "https://api.themoviedb.org/3"
// })

// export default instance;

import axios from 'axios';

const instance = axios.create({
    baseURL: "http://localhost:8080/genres/"
})

export default instance;