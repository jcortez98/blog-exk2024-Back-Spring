package org.carloscortez.blogexk2024.service;

import org.carloscortez.blogexk2024.model.Post;

import java.util.List;

public interface IPostService {

    public List<Post> listarPost();

    public Post GuardarPost(Post post);

    public Post buscarPostPorId(int postId);

    public void eliminarPostPorId(int postId);
}
