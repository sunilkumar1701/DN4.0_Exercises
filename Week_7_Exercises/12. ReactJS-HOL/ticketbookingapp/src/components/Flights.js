// src/components/Flights.js
import React from 'react';

const Flights = () => {
  const flightData = [
    { id: 1, from: 'New York', to: 'London', price: 550 },
    { id: 2, from: 'Delhi', to: 'Dubai', price: 320 },
    { id: 3, from: 'Tokyo', to: 'Paris', price: 710 }
  ];

  return (
    <div>
      <h3>Available Flights</h3>
      <ul>
        {flightData.map(flight => (
          <li key={flight.id}>
            {flight.from} ➡ {flight.to} – ${flight.price}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Flights;
