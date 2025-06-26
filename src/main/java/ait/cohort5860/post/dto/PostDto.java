package ait.cohort5860.post.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime dateCreated;
    private Set<String> tags;
    private Long likes;
    private List<String> comments;
}
