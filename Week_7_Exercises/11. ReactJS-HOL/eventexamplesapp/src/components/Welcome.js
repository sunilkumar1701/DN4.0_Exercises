import React from 'react';
import './Components.css';

function Welcome() {
  const sayWelcome = (msg) => {
    alert(`Message: ${msg}`);
  };

  return (
    <div className="section">
      <h2>Say Welcome</h2>
      <button onClick={() => sayWelcome('Welcome')}>Say Welcome</button>
    </div>
  );
}

export default Welcome;
