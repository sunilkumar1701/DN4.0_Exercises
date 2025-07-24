import React from 'react';
import './App.css'; // Required for styling

class PostItem extends React.Component {
  render() {
    const { post } = this.props;

    return (
      <div className="post-item">
        <h3>{post.title}</h3>
        <p>{post.body}</p>
      </div>
    );
  }
}

export default PostItem;
