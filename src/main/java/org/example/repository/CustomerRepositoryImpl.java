package org.example.repository;
import org.example.dto.CustomerDTO;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    List<CustomerDTO> customerList = new ArrayList<>();

    {
        CustomerDTO c1 = new CustomerDTO();
        c1.setCustomerName("Jonas");
        c1.setCustomerAge(34);
        c1.setAccountType("Current");
        customerList.add(c1);

        CustomerDTO c2 = new CustomerDTO();
        c2.setCustomerName("Lisa");
        c2.setCustomerAge(23);
        c2.setAccountType("Savings");
        customerList.add(c2);

        CustomerDTO c3 = new CustomerDTO();
        c3.setCustomerName("Schmidt");
        c3.setCustomerAge(55);
        c3.setAccountType("Current");
        customerList.add(c3);

    }

    @Override
    public List<CustomerDTO> fetchCustomerData() {
        return customerList;
    }

    @Override
    public void addCustomer(CustomerDTO newCustomer) {
          customerList.add(newCustomer);
          System.out.println(newCustomer.getCustomerName()+" " + "has added");

    }
}
