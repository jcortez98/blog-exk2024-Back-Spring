package org.carloscortez.blogexk2024.repository;

import org.carloscortez.blogexk2024.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
