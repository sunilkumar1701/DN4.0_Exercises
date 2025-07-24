import logo from './logo.svg';
import './App.css';
import { CohortsData} from './Cohort'
import CohortDetails from './CohortDetails'; 

function App() {
 
  return (
  <div className="App">
  <h1>Cohorts Details</h1>
  <div>
    {CohortsData.map(cohort => <CohortDetails key={cohort.cohortCode} cohort={cohort} />)}
  </div>
</div>

  );
}

export default App;
