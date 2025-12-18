package com.sparta.postapplication.domains.post.service.dto;

import java.time.LocalDateTime;

import com.sparta.postapplication.domains.post.domain.model.Post;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Builder(access = AccessLevel.PRIVATE)
@Getter
public class GetPostResponse {

	private Long id;
	private String title;
	private String content;
	private LocalDateTime createdAt;

	public static GetPostResponse of(Post post) {
		return GetPostResponse.builder()
			.id(post.getId())
			.title(post.getTitle())
			.content(post.getContent())
			.createdAt(post.getCreatedAl())
			.build();
	}
}
