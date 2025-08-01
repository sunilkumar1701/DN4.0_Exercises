// src/components/UserPage.js
import React from 'react';
import Flights from './Flights';

const UserPage = () => {
  return (
    <div className="page">
      <h2>Welcome, User!</h2>
      <p>You can now book tickets.</p>
      <Flights />
      <button className="book-btn">Book Now</button>
    </div>
  );
};

export default UserPage;
