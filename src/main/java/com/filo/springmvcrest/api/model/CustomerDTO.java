package com.filo.springmvcrest.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    Created by T. Filo Zegarlicki on 04.05.2022
**/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private String firstname;
    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;
}