// HANDLES SEARCHES ... DUH

//HANDLES SAVED RECIPES, RECIPE SEARCH RESULTS

import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';

import backEndURL from "../helpers/BackEndURL.js";
import recipeSearchByIngredientsURL from "../helpers/APIURL.js";

class SearchContainer extends Component{
  constructor(props){
    super(props);

    this.state={

    }
  }

  // LOGIC STARTS HERE

  //RENDER STARTS HERE
  render(){
    return(
      <p> This is the Search Container </p>
    )
  }
}

export default SearchContainer;