// src/App.js
import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div className="App">
      <h1>Flight Ticket Booking App</h1>

      {isLoggedIn ? (
        <>
          <UserPage />
          <button className="logout-btn" onClick={handleLogout}>Logout</button>
        </>
      ) : (
        <>
          <GuestPage />
          <button className="login-btn" onClick={handleLogin}>Login</button>
        </>
      )}
    </div>
  );
}

export default App;
