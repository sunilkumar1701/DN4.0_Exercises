import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <h1>Welcome to Score Calculator App</h1>
      <CalculateScore 
        name="John Doe"
        school="Greenwood High"
        total={420}
        goal={6}
      />
    </div>
  );
}

export default App;
