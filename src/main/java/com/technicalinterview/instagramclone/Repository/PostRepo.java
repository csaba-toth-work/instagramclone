package com.technicalinterview.instagramclone.Repository;

import com.technicalinterview.instagramclone.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface PostRepo extends CrudRepository<Post, Integer> {

    Post save(Post post);
    ArrayList<Post> findAll();
}
