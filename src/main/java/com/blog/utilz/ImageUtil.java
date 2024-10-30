package com.blog.utilz;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

public class ImageUtil {

    public String convertImageToBase64(MultipartFile file) throws IOException {
        byte[] imageBytes = file.getBytes();
        return Base64.getEncoder().encodeToString(imageBytes);
    }
}
