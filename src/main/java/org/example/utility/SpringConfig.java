package org.example.utility;
import org.example.repository.CustomerRepository;
import org.example.repository.CustomerRepositoryImpl;
import org.example.service.CustomerService;
import org.example.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    CustomerRepository customerRepository(){
        return new CustomerRepositoryImpl();
    }

    @Bean
   CustomerService customerService(){
       return new CustomerServiceImpl(customerRepository());
   }
}
