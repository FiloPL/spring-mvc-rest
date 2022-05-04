package com.filo.springmvcrest.bootstrap;

import com.filo.springmvcrest.domain.Category;
import com.filo.springmvcrest.domain.Customer;
import com.filo.springmvcrest.domain.Vendor;
import com.filo.springmvcrest.repositories.CategoryRepository;
import com.filo.springmvcrest.repositories.CustomerRepository;
import com.filo.springmvcrest.repositories.VendorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by T. Filo Zegarlicki on 04.05.2022
 **/

@Slf4j
@Component
public class Bootstrap implements CommandLineRunner{

    private final CategoryRepository categoryRespository;
    private final CustomerRepository customerRepository;
    private final VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRespository, CustomerRepository customerRepository, VendorRepository vendorRepository) {
        this.categoryRespository = categoryRespository;
        this.customerRepository = customerRepository;
        this.vendorRepository = vendorRepository;
    }
    @Override
    public void run(String... args)  {
        loadCategories();
        loadCustomers();
        loadVendors();
    }

    private void loadVendors() {
        Vendor vendor1 = new Vendor();
        vendor1.setName("Vendor 1");
        vendorRepository.save(vendor1);

        Vendor vendor2 = new Vendor();
        vendor2.setName("Vendor 2");
        vendorRepository.save(vendor2);
    }


    private void loadCategories() {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRespository.save(fruits);
        categoryRespository.save(dried);
        categoryRespository.save(fresh);
        categoryRespository.save(exotic);
        categoryRespository.save(nuts);

        log.info("Categories Loaded: " + categoryRespository.count());
    }

    private void loadCustomers() {
        //given
        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setFirstname("Michale");
        customer1.setLastname("Weston");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setId(2L);
        customer2.setFirstname("Sam");
        customer2.setLastname("Axe");

        customerRepository.save(customer2);

        log.info("Customers Loaded: " + customerRepository.count());
    }
}