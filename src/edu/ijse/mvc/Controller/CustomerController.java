/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.Controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Chirath
 */
public class CustomerController {
    private CustomerModel customerModel;

    public CustomerController() {
        customerModel = new CustomerModel();
    }
    
    public String addCustomer(CustomerDto customerDto)throws ClassNotFoundException, SQLException{
        String respond = customerModel.addCustomer(customerDto);
        return respond;
    }
    
    public String deleteCustomer(String CustId)throws ClassNotFoundException, SQLException{
        String respond = customerModel.deleteCustomer(CustId);
        return respond;
    }
    
    public CustomerDto searchCustomer(String custId)throws ClassNotFoundException, SQLException{
        CustomerDto respond = customerModel.searchCustomer(custId);
        return respond;
    }
    
    public String updateCustomer(CustomerDto customerDto)throws ClassNotFoundException, SQLException{
        String respond = customerModel.updateCustomer(customerDto);
        return respond;
    }
    
    public ArrayList<CustomerDto> viewAllCustomer()throws ClassNotFoundException, SQLException{
        ArrayList<CustomerDto> respond = customerModel.viewAllCustomer();
        return respond;
    }
}
