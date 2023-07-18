package org.example;
import org.example.dto.CustomerDTO;
import org.example.repository.CustomerRepository;
import org.example.service.CustomerService;
import org.example.service.CustomerServiceImpl;
import org.example.utility.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       CustomerService customerService= context.getBean(CustomerService.class,"customerService");

        List<CustomerDTO> list1 = customerService.getAllCustomers();
        list1.forEach(e->{
             e.getCustomerName();
            e.getCustomerAge();
             e.getAccountType();
        });
    }
}