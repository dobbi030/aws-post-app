package com.sparta.postapplication.domains.post.service.dto;

public record CreatePostRequest(
	String title,
	String content
) {
}
