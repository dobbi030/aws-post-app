package com.sparta.postapplication.domains.post.service.dto;

import lombok.Getter;

@Getter
public record CreatePostRequest(
	String title,
	String content
) {
}
