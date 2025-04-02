/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDto;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Chirath
 */
public class OrderModel {
    public String addOrder(OrderDto orderDto)throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String sql = "INSERT INTO orders VALUES (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, orderDto.getOrderID());
        statement.setString(2, orderDto.getOrderDate());
        statement.setString(3, orderDto.getCustID());
        
        int rst = statement.executeUpdate();
        
        return rst > 0 ? "Order Placed Successfuly" : "Faild to Place Order";
    }
    
    public String deleteOrder(String orderId)throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String sql = "DELETE FROM orders WHERE OrderID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, orderId);
        
        int rst = statement.executeUpdate();
        
        return rst > 0 ? "Order Deleted Successfully" : "Failed to Delete Order";
        
    }
    
    public String updateOrder(OrderDto orderDto)throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String sql = "UPDATE orders SET OrderID = ?, OrderDate = ?, CustID =?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, orderDto.getOrderID());
        statement.setString(2, orderDto.getOrderDate());
        statement.setString(3, orderDto.getCustID());
        
        int rst = statement.executeUpdate();
        
        return rst > 0 ? "Order Updated Successfully" : "Failed to Update Order";
    }
    
    public OrderDto searchOrder(String orderId)throws ClassNotFoundException ,SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String sql = "SELECT * FROM orders WHERE OrderID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, orderId);
        
        ResultSet rst = statement.executeQuery();
        
        if(rst.next()){
            OrderDto orderDto = new OrderDto(rst.getString("OrderID"), rst.getString("OrderDate"), rst.getString("CustID"));
            return orderDto;
        }else{
            return null;
        }
    }
    
    public ArrayList<OrderDto> viewAllOrders()throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String sql = "SELECT * FROM orders";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet rst = statement.executeQuery();
        ArrayList<OrderDto> orderDtos = new ArrayList<>();
        
        while(rst.next()){
            OrderDto orderDto = new OrderDto(rst.getString("OrderID"), rst.getString("OrderDate"), rst.getString("CustID"));
            orderDtos.add(orderDto);
        }
        
        return orderDtos;
    }
}
