package com.blog.vo.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Setter
@Getter
public class CreateBlogRequestVO {

    private String title;
    private String desc;
    private String content;
    private MultipartFile thumbnailFile;
    private MultipartFile bodyOptional01File;
    private MultipartFile bodyOptional02File;
    private Date postedDate;
    private Date lastUpdatedDate;

}
