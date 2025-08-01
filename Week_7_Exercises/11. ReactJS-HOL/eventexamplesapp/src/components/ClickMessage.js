import React from 'react';
import './Components.css';

function ClickMessage() {
  const handleClick = (e) => {
    alert('I was clicked');
    console.log(e);
  };

  return (
    <div className="section">
      <h2>Synthetic Event</h2>
      <button onClick={handleClick}>Synthetic OnPress</button>
    </div>
  );
}

export default ClickMessage;
