/*******************************************************************************************************************
 * 1. created a customer DTO class to map all the data
 ********************************************************************************************************************/

package org.example.dto;
public class CustomerDTO {
    private String customerName;
    private int customerAge;
    private String accountType ;

    public CustomerDTO(String customerName, int customerAge, String accountType) {

        this.customerName = customerName ;
        this.customerAge = customerAge ;
        this.accountType = accountType;

    }

    public CustomerDTO() {

    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
