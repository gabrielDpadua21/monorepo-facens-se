import React from 'react';
import Routes from './Routes';

import "./assets/scss/material-kit-react.scss";

require('dotenv').config()

function App() {
  return (
    <div className="App">
      <Routes />
    </div>
  );
}

export default App;
