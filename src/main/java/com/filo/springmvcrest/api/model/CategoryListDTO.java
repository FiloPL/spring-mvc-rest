package com.filo.springmvcrest.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by T. Filo Zegarlicki on 04.05.2022
 **/

@Data
@AllArgsConstructor
public class CategoryListDTO {

    List<CategoryDTO> categories;
}