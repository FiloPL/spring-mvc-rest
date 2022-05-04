package com.filo.springmvcrest.api.mapper;

import com.filo.springmvcrest.api.model.CategoryDTO;
import com.filo.springmvcrest.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by T. Filo Zegarlicki on 04.05.2022
 **/

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    CategoryDTO categoryToCategoryDTO(Category category);
}