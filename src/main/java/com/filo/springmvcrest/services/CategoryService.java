package com.filo.springmvcrest.services;

import com.filo.springmvcrest.api.model.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by T. Filo Zegarlicki on 04.05.2022
 **/

@Service
public interface CategoryService {

    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryByName(String name);
}