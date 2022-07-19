import React from 'react'
import './goku.css'
import {Link} from 'react-router-dom'

function Goku() {
  return (
    <div className="animated-main">
    <div className='animated-box'></div>
    {/* <div className='box2'>
      <div className='text'>
        Animu
      
      </div>
      
 
    </div> */}
     <div className='animated-container'>
    <div className='body-textWriter2'>
        <h1 className='animated-h1'>Animu</h1>
        <h2 className='animated-h2'>is loading...</h2>
        <br/>
    </div>
    {/* <div>
       
        <Link to="/home">
        <button className='button1'>Start</button>
        </Link></div> */}
        
    </div>


  </div>
  )
}

export default Goku