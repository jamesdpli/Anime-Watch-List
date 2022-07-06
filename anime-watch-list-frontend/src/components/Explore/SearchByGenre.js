
import React from 'react'
import EachGenreButton from './EachGenreButton'

function SearchByGenre({setSelectedGenre, genres}) {



    console.log(genres)

    const eachGenre = genres.map(genre => <EachGenreButton key= {genre.id} setSelectedGenre ={setSelectedGenre} genre = {genre}/>)

    

  return (
    <>
    {eachGenre}
    </>
  )
}

export default SearchByGenre