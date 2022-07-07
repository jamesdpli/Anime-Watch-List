import React from 'react'

function EachGenreButton({genre, setSelectedGenre}) {

    console.log(genre.name)


    const handleGenreButton = (e) =>{
        e.preventDefault()
        setSelectedGenre(e.target.value)

    }
  return (
    <button className='genreButton' onClick={handleGenreButton} value ={genre.name}> {genre.name} </button>
  )
}

export default EachGenreButton