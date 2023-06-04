package com.project.questapp.responses;

import com.project.questapp.entities.Like;
import com.project.questapp.entities.Post;
import lombok.Data;

import java.util.List;

@Data
public class PostResponse {

    Long id;
    Long userId;
    String userName;
    String title;
    String text;
    List<LikeResponse> postLikes;

    public PostResponse(Post entity, List<LikeResponse> likes) {
        id = entity.getId();
        userId = entity.getUser().getId();
        userName = entity.getUser().getUserName();
        title = entity.getTitle();
        text = entity.getText();
        postLikes = likes;
    }
}
