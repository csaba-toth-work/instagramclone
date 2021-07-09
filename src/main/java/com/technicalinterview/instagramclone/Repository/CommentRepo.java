package com.technicalinterview.instagramclone.Repository;

import com.technicalinterview.instagramclone.Entity.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentRepo  extends CrudRepository<Comments,Integer> {

    Comments save(Comments comments);
    ArrayList<Comments> findAllByPostId(String postID);
}
