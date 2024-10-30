package com.blog.service;

import com.blog.dto.request.CreateBlogRequestDTO;
import com.blog.dto.response.CreateBlogResponseDTO;

public interface BlogService {

    CreateBlogResponseDTO createBlog(CreateBlogRequestDTO createBlogRequestDTO);
}
