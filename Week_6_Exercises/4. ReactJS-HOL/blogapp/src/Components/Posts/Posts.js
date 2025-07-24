import React from 'react';
import Post from '../../Post';
import PostItem from '../../PostItem';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((res) => res.json())
      .then((data) => {
        const postList = data.map(
          (item) => new Post(item.id, item.title, item.body)
        );
        this.setState({ posts: postList });
      })
      .catch((error) => {
        this.setState({ hasError: true });
        console.error('Error fetching posts:', error);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('Something went wrong while loading posts.');
    console.error('Caught in componentDidCatch:', error, info);
  }

  render() {
    if (this.state.hasError) {
      return <h2 style={{ color: 'red' }}>Unable to load posts at the moment.</h2>;
    }

    return (
      <div>
        <h1>Latest Blog Posts</h1>
        {this.state.posts.map((post) => (
          <PostItem key={post.id} post={post} />
        ))}
      </div>
    );
  }
}

export default Posts;
