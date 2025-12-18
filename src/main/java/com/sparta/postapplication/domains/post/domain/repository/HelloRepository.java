package com.sparta.postapplication.domains.post.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sparta.postapplication.domains.post.domain.model.Post;

public interface HelloRepository extends JpaRepository<Post, Long> {
}
