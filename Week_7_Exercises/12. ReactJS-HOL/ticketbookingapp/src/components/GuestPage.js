// src/components/GuestPage.js
import React from 'react';
import Flights from './Flights';

const GuestPage = () => {
  return (
    <div className="page">
      <h2>Welcome, Guest!</h2>
      <p>Please login to book your ticket.</p>
      <Flights />
    </div>
  );
};

export default GuestPage;
