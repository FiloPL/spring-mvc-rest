package com.filo.springmvcrest.repositories;

import com.filo.springmvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by T. Filo Zegarlicki on 04.05.2022
 **/
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}