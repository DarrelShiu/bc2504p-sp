package com.bootcamp.demo.demo_api.service;

import com.bootcamp.demo.demo_api.entity.CommentEntity;
import com.bootcamp.demo.demo_api.entity.UserEntity;
import com.bootcamp.demo.demo_api.entity.PostEntity;
import com.bootcamp.demo.demo_api.model.dto.UserDTO;
import java.util.List;

public interface JPService  {
  List<UserDTO> getUsers();
  List<UserEntity> getAndSaveUsers();
  List<PostEntity> getAndSavePosts();
  List<CommentEntity> getAndSaveComments();

  List<PostEntity> getPostsByUserId(Long userId);

  List<UserEntity> findAllUsers();
}
