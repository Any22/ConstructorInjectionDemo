package org.example.service;
import org.example.dto.CustomerDTO;
import java.util.List;

public interface CustomerService {
   public void insertCustomer(CustomerDTO customer);
   List<CustomerDTO> getAllCustomers();
}
