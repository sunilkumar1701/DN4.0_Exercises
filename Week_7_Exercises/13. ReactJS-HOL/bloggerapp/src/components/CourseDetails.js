import React from "react";

function CourseDetails() {
  const courses = [
    { id: 1, name: "Advanced React", instructor: "Mark Lee" },
    { id: 2, name: "Node.js Essentials", instructor: "Sarah Connor" },
    { id: 3, name: "Full Stack Development", instructor: "David Kim" }
  ];

  return (
    <div>
      <h2>Course Details</h2>
      {courses.map((course) => (
        <div key={course.id} style={{ marginBottom: "10px" }}>
          <p><strong>Course:</strong> {course.name}</p>
          <p><strong>Instructor:</strong> {course.instructor}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
