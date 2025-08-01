// src/components/OfficeList.js
import React from 'react';

const offices = [
  {
    id: 1,
    name: "Downtown Hub",
    rent: 55000,
    address: "123 Main St, New York, NY",
    image: "https://images.unsplash.com/photo-1600585154340-be6161a56a0c?ixlib=rb-4.0.3&auto=format&fit=crop&w=800&q=80"
  },
  {
    id: 2,
    name: "Suburban Space",
    rent: 65000,
    address: "456 Elm St, San Jose, CA",
    image: "https://images.unsplash.com/photo-1560448204-e02f11c3d0e2?ixlib=rb-4.0.3&auto=format&fit=crop&w=800&q=80"
  },
  {
    id: 3,
    name: "City Center Tower",
    rent: 75000,
    address: "789 Park Ave, Chicago, IL",
    image: "https://images.unsplash.com/photo-1600891964599-f61ba0e24092?ixlib=rb-4.0.3&auto=format&fit=crop&w=800&q=80"
  }
];

function OfficeList() {
  return (
    <div>
      <h1>Office Space Rental Listings</h1>
      {offices.map(office => (
        <div
          key={office.id}
          style={{
            marginBottom: "30px",
            border: "1px solid #ccc",
            padding: "10px",
            borderRadius: "8px",
            boxShadow: "0 2px 8px rgba(0, 0, 0, 0.1)"
          }}
        >
          <img
            src={office.image}
            alt={office.name}
            style={{ width: "100%", maxWidth: "300px", borderRadius: "8px" }}
          />
          <h2>{office.name}</h2>
          <p><strong>Address:</strong> {office.address}</p>
          <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
            <strong>Rent:</strong> ₹{office.rent.toLocaleString()}
          </p>
        </div>
      ))}
    </div>
  );
}

export default OfficeList;
