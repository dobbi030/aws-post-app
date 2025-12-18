package com.sparta.postapplication.domains.post.service;

import org.springframework.stereotype.Service;

import com.sparta.postapplication.domains.post.domain.model.Post;
import com.sparta.postapplication.domains.post.domain.repository.HelloRepository;
import com.sparta.postapplication.domains.post.service.dto.CreatePostRequest;
import com.sparta.postapplication.domains.post.service.dto.GetPostResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HelloService {

	private final HelloRepository helloRepository;

	public Post create(CreatePostRequest request) {
		Post post = Post.create(request.title(), request.content());

		return helloRepository.save(post);
	}

	public GetPostResponse getPost(Long postId) {
		Post post = helloRepository.findById(postId).orElseThrow();

		return GetPostResponse.of(post);
	}
}
