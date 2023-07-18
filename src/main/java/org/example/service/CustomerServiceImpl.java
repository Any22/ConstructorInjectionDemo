package org.example.service;
import org.example.dto.CustomerDTO;
import org.example.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
 private CustomerRepository customerRepository;

 //Applying Constructor injection here
 public CustomerServiceImpl(CustomerRepository customerRepository){
          this.customerRepository = customerRepository ;
 }
    @Override
    public void insertCustomer(CustomerDTO customer) {

     customerRepository.addCustomer(customer);
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.fetchCustomerData();
    }
}
