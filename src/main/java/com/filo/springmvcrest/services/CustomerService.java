package com.filo.springmvcrest.services;

import com.filo.springmvcrest.api.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by T. Filo Zegarlicki on 04.05.2022
 **/

@Service
public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customerDTO);

    CustomerDTO saveCustomerByDTO(Long id, CustomerDTO customerDTO);
}