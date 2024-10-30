package com.blog.vo.resonse;

import lombok.Getter;

import java.util.Date;

@Getter
public class CreateBlogResponseVO {
    private String chatId;
    private String messageId;
    private String title;
    private String desc;
    private String content;
    private String thumbnailBase64;
    private String bodyOptional01Base64;
    private String bodyOptional02Base64;
    private Date postedDate;
    private Date lastUpdatedDate;
}
