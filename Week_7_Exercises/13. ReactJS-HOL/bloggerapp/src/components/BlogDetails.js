import React from "react";

function BlogDetails() {
  const blogs = [
    { id: 1, title: "React Hooks Explained", author: "Alice" },
    { id: 2, title: "Using useState and useEffect", author: "Bob" },
    { id: 3, title: "Performance Optimization", author: "Charlie" }
  ];

  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.map((blog) => (
        <div key={blog.id} style={{ marginBottom: "10px" }}>
          <p><strong>Title:</strong> {blog.title}</p>
          <p><strong>Author:</strong> {blog.author}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
