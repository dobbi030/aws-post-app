package com.sparta.postapplication.domains.post.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sparta.postapplication.domains.post.domain.model.Post;
import com.sparta.postapplication.domains.post.service.HelloService;
import com.sparta.postapplication.domains.post.service.dto.CreatePostRequest;
import com.sparta.postapplication.domains.post.service.dto.GetPostResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

	public final HelloService helloService;

	@GetMapping
	ResponseEntity<String> hello() {
		return ResponseEntity.ok("hello world: es.kang");
	}

	@PostMapping
	ResponseEntity<Post> create(CreatePostRequest request) {
		Post post = helloService.create(request);

		return ResponseEntity.ok(post);
	}

	@GetMapping("/{postId}")
	ResponseEntity<GetPostResponse> getPost(@PathVariable Long postId) {
		GetPostResponse response = helloService.getPost(postId);

		return ResponseEntity.ok(response);
	}
}
