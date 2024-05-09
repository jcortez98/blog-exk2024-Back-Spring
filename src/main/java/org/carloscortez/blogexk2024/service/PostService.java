package org.carloscortez.blogexk2024.service;

import org.carloscortez.blogexk2024.model.Post;
import org.carloscortez.blogexk2024.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> listarPost() {
        return this.postRepository.findAll();
    }

    @Override
    public Post GuardarPost(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Post buscarPostPorId(int postId) {
        return this.postRepository.findById(postId).orElse(null);
    }

    @Override
    public void eliminarPostPorId(int postId) {
        this.postRepository.deleteById(postId);
    }
}
