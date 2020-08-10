import React from 'react';

const NavBar = (props) => {

  function handleNavClick(event){
    props.handleViewChange(event.target.value);
  }

  return(
    <header>
    <h2> THIS IS THE NAV BAR </h2>

    <button value={["list", "recipe"]} onClick={handleNavClick}>My Recpies</button>
    <button value={["list", "shopping"]} onClick={handleNavClick}>My Shopping List Recpies</button>
    <button value={["list", "dietary"]} onClick={handleNavClick}>My Dietary Needs and Intolerances</button>
    </header>
  )


}

export default NavBar;
