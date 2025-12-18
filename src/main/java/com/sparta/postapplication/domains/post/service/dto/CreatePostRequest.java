package com.sparta.postapplication.domains.post.service.dto;

import lombok.ToString;

@ToString
public record CreatePostRequest(
	String title,
	String content
) {
}
