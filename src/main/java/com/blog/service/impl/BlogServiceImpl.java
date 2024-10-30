package com.blog.service.impl;

import com.blog.dto.request.CreateBlogRequestDTO;
import com.blog.dto.response.CreateBlogResponseDTO;
import com.blog.service.BlogService;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class BlogServiceImpl implements BlogService {

    @Override
    public CreateBlogResponseDTO createBlog(CreateBlogRequestDTO createBlogRequestDTO) {

        MultipartFile thumbnailImg = createBlogRequestDTO.getThumbnailFile();
        String title = createBlogRequestDTO.getTitle();
        String desc = createBlogRequestDTO.getDesc();
        Date postedDate = new Date();
        Date lastUpdatedDate = null;

        MultipartFile optionalFile1 = createBlogRequestDTO.getBodyOptional01File() == null ? null : createBlogRequestDTO.getBodyOptional01File();
        MultipartFile optionalFile2 = createBlogRequestDTO.getBodyOptional02File() == null ? null : createBlogRequestDTO.getBodyOptional02File();

        CreateBlogResponseDTO response = new CreateBlogResponseDTO();
        //call to upload to telegram
        //get response back
        //set response

        return null;
    }
}
