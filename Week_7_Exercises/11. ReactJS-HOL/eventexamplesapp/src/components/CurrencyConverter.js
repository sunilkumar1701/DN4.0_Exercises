// src/components/CurrencyConverter.js
import React, { useState } from 'react';
import './Components.css';

const rates = {
  INR: { USD: 0.012, EUR: 0.011 },
  USD: { INR: 83.5, EUR: 0.92 },
  EUR: { INR: 91.0, USD: 1.09 }
};

const CurrencyConverter = () => {
  const [amount, setAmount] = useState('');
  const [from, setFrom] = useState('INR');
  const [to, setTo] = useState('EUR');
  const [converted, setConverted] = useState(null);
  const [error, setError] = useState('');

  const handleConvert = () => {
    setError('');
    if (!amount || isNaN(amount) || parseFloat(amount) <= 0) {
      setError('Please enter a valid amount.');
      setConverted(null);
      return;
    }

    if (from === to) {
      setConverted(parseFloat(amount).toFixed(2));
      return;
    }

    const rate = rates[from][to];
    const result = (parseFloat(amount) * rate).toFixed(2);
    setConverted(result);
  };

  return (
    <div className="section">
      <h2>Advanced Currency Converter</h2>

      <div style={{ marginBottom: '10px' }}>
        <input
          type="number"
          value={amount}
          onChange={e => setAmount(e.target.value)}
          placeholder="Enter amount"
        />

        <select value={from} onChange={e => setFrom(e.target.value)}>
          <option>INR</option>
          <option>USD</option>
          <option>EUR</option>
        </select>

        <span style={{ margin: '0 10px' }}>to</span>

        <select value={to} onChange={e => setTo(e.target.value)}>
          <option>INR</option>
          <option>USD</option>
          <option>EUR</option>
        </select>

        <button onClick={handleConvert}>Convert</button>
      </div>

      {error && <p style={{ color: 'red' }}>{error}</p>}

      {converted && (
        <p>
          Converted: <strong>{converted} {to}</strong>
        </p>
      )}
    </div>
  );
};

export default CurrencyConverter;
