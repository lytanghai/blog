package com.blog.controller;

import com.blog.dto.response.CreateBlogResponseDTO;
import com.blog.mapper.BlogMapper;
import com.blog.service.BlogService;
import com.blog.vo.request.CreateBlogRequestVO;
import com.blog.vo.resonse.CreateBlogResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/upload")
    public CreateBlogResponseVO uploadMultipleImages(@RequestBody CreateBlogRequestVO createBlogRequestVO) {
        CreateBlogResponseDTO response = blogService.createBlog(BlogMapper.INSTANCE.covertTo(createBlogRequestVO));
        return BlogMapper.INSTANCE.convertFrom(response);
    }
}
