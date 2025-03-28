/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.CustomerDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Chirath
 */
public class CustomerModel {
    public String addCustomer(CustomerDto customerDto)throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, customerDto.getCustID());
        statement.setString(2, customerDto.getCustTitle());
        statement.setString(3, customerDto.getCustName());
        statement.setString(4, customerDto.getDob());
        statement.setDouble(5, customerDto.getSalary());
        statement.setString(6, customerDto.getCustAddresss());
        statement.setString(7, customerDto.getCity());
        statement.setString(8, customerDto.getProvince());
        statement.setInt(9, customerDto.getPostalCode());
        
        return statement.executeUpdate() > 0 ? "Customer Added Successfully" : "Failed to Add Customer" ;
    }
    
    public String deleteCustomer(String custId)throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM customer WHERE CustID = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, custId);
        
        return statement.executeUpdate() > 0 ? "Customer Deleted Successfully" : "Failed to Delete Customer";
    }
    
    public String updateCustomer(CustomerDto customerDto)throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE customer SET CustID = ? , CustTitle = ? , CustName = ? , DOB = ? , salary = ? , CustAddress = ? , City = ? , Province = ? , PostalCode = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, customerDto.getCustID());
        statement.setString(2, customerDto.getCustTitle());
        statement.setString(3, customerDto.getCustName());
        statement.setString(4, customerDto.getDob());
        statement.setDouble(5, customerDto.getSalary());
        statement.setString(6, customerDto.getCustAddresss());
        statement.setString(7, customerDto.getCity());
        statement.setString(8, customerDto.getProvince());
        statement.setInt(9, customerDto.getPostalCode());
        
        return statement.executeUpdate() > 0 ? "Customer Updated Successfully" : "Failed to Update Customer";
    }
    
    public CustomerDto searchCustomer(String custId)throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer WHERE CustID = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, custId);
        
        ResultSet rst = statement.executeQuery();
        
        if(rst.next()){
            CustomerDto customerDto = new CustomerDto(rst.getString("CustID"), rst.getString("CustTitle"), rst.getString("CustName"), rst.getString("DOB"), rst.getDouble("salary"), rst.getString("CustAddress"), rst.getString("City"), rst.getString("Province"), rst.getInt("PostalCode"));
            return customerDto;
        }else {
            return null;
        }
    }
    
    public ArrayList<CustomerDto> viewAllCustomer()throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet rst = statement.executeQuery();
        
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        
        while(rst.next()){
            CustomerDto dto = new CustomerDto(rst.getString("CustID"), rst.getString("CustTitle"), rst.getString("CustName"), rst.getString("DOB"), rst.getDouble("salary"), rst.getString("CustAddress"), rst.getString("City"), rst.getString("Province"), rst.getInt("PostalCode"));
            customerDtos.add(dto);
        }
        
        return customerDtos;
    }
    
}
