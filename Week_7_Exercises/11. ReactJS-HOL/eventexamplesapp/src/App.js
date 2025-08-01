// src/App.js
import React from 'react';
import Counter from './components/Counter';
import Welcome from './components/Welcome';
import ClickMessage from './components/ClickMessage';
import CurrencyConverter from './components/CurrencyConverter';

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h1>React Event Handling Examples</h1>
      <Counter />
      <hr />
      <Welcome />
      <hr />
      <ClickMessage />
      <hr />
      <CurrencyConverter />
    </div>
  );
}

export default App;
