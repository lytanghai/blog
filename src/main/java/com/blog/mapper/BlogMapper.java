package com.blog.mapper;

import com.blog.dto.request.CreateBlogRequestDTO;
import com.blog.dto.response.CreateBlogResponseDTO;
import com.blog.vo.request.CreateBlogRequestVO;
import com.blog.vo.resonse.CreateBlogResponseVO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BlogMapper {
    BlogMapper INSTANCE = Mappers.getMapper(BlogMapper.class);

    CreateBlogRequestDTO covertTo(CreateBlogRequestVO createBlogRequestVO);

    CreateBlogResponseVO convertFrom(CreateBlogResponseDTO response);
}
