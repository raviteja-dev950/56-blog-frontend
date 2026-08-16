import { useEffect, useState } from 'react';
import api from '../api/api';
export default function BlogList() {
  const [posts, setPosts] = useState([]);
  useEffect(() => { api.get('/posts').then(res => setPosts(res.data)); }, []);
  return (
    <div className="p-6">
      <h1 className="text-3xl font-bold mb-6">Ravi's Blog</h1>
      <div className="grid grid-cols-3 gap-4">
        {posts.map(post => (
          <div key={post.id} className="border p-4 rounded">
            <img src={post.imageUrl} className="w-full h-40 object-cover" alt="" />
            <h2 className="font-bold mt-2">{post.title}</h2>
            <p className="text-sm">{post.author} - {post.category}</p>
            <p className="mt-2">{post.content}</p>
          </div>
        ))}
      </div>
    </div>
  );
}