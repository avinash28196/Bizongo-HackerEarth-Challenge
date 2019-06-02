import React from 'react';
import logo from './logo.svg';
import './App.css';
import Header from './component/header.js';
import FetchGamesSales  from './component/fetchGameSales.js';

function App() {
  return (
    <div>
       <Header />
       <div className="d-flex justify-content-center">
       <FetchGamesSales />
       </div>
     </div>
  );
}

export default App;
