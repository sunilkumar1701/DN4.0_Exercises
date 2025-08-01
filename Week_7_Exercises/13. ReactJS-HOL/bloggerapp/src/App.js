import React from "react";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";
import "./App.css";

function App() {
  return (
    <div className="app-container">
      <h1>Blogger App</h1>

      <div className="cards-container">
        <div className="section"><BookDetails /></div>
        <div className="section"><BlogDetails /></div>
        <div className="section"><CourseDetails /></div>
      </div>
    </div>
  );
}

export default App;
