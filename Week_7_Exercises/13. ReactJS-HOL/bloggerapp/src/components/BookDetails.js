import React from "react";

function BookDetails() {
  const books = [
    { id: 1, title: "React Mastery", author: "John Doe" },
    { id: 2, title: "Learning JavaScript", author: "Jane Austen" },
    { id: 3, title: "Frontend for Beginners", author: "Steve Jobs" }
  ];

  return (
    <div>
      <h2>Book Details</h2>
      {books.map((book) => (
        <div key={book.id} style={{ marginBottom: "10px" }}>
          <p><strong>Title:</strong> {book.title}</p>
          <p><strong>Author:</strong> {book.author}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
