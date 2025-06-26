package ait.cohort5860.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class CommentDto {
    @JsonProperty("user")
    private String username;
    private String message;
    private LocalDateTime dateCreated;
    private Long likes;
}
