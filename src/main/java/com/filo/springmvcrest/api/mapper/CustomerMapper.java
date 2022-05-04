package com.filo.springmvcrest.api.mapper;

import com.filo.springmvcrest.api.model.CustomerDTO;
import com.filo.springmvcrest.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by T. Filo Zegarlicki on 04.05.2022
 **/

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}