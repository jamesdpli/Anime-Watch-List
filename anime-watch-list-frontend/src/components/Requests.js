// const API_KEY = "3c042052442f6c942f98ed0becd08be7";

// const requests = {
//   fetchTrending: `/trending/all/week?api_key=${API_KEY}&language=en-US`,
//   fetchNetflixOriginals: `/discover/tv?api_key=${API_KEY}&with_networks=213`,
//   fetchTopRated: `/movie/top_rated?api_key=${API_KEY}&language=en-US`,
//   fetchActionMovies: `/discover/movie?api_key=${API_KEY}&with_genres=28`,
//   fetchComedyMovies: `/discover/movie?api_key=${API_KEY}&with_genres=35`,
//   fetchHorrorMovies: `/discover/movie?api_key=${API_KEY}&with_genres=27`,
//   fetchRomanceMovies: `/discover/movie?api_key=${API_KEY}&with_genres=10749`,
//   fetchDocumentaries: `/discover/movie?api_key=${API_KEY}&with_genres=99`,
// };

// export default requests;

// https://api.themoviedb.org/3/trending/all/week?api_key=3c042052442f6c942f98ed0becd08be7&language=en-US

const requests = {
  fetchComedyAnimes: `/1`,
  fetchActionAnimes: `/2`,
  fetchEcchiAnimes: `/3`,
  fetchSupernaturalAnimes: `/4`,
  fetchDramaAnimes: `/8`,
  fetchRomanceAnimes: `/12`
};


export default requests;

// http://localhost:8080/1