package com.blog.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateBlogResponseDTO {
    private String title;
    private String desc;
    private String content;
    private String thumbnailBase64;
    private String bodyOptional01Base64;
    private String bodyOptional02Base64;
    private Date postedDate;
    private Date lastUpdatedDate;

    //Telegram
    private String chatId;
    private String messageId;
}
