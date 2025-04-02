/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.Controller;
import edu.ijse.mvc.dto.OrderDto;
import edu.ijse.mvc.model.OrderModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Chirath
 */
public class OrderController {
    private OrderModel orderModel;

    public OrderController() {
        orderModel = new OrderModel();
    }
    
    public String addOrder(OrderDto orderDto)throws ClassNotFoundException, SQLException{
        String respond = orderModel.addOrder(orderDto);
        return respond;
    }
    
    public String deleteOrder(String orderId)throws ClassNotFoundException, SQLException{
        String respond = orderModel.deleteOrder(orderId);
        return respond;
    }
    
    public String updateOrder(OrderDto orderDto)throws ClassNotFoundException, SQLException{
        String respond = orderModel.updateOrder(orderDto);
        return respond;
    }
    
    public OrderDto searchOrder(String OrderId)throws ClassNotFoundException, SQLException{
        OrderDto orderDto = orderModel.searchOrder(OrderId);
        return orderDto;
    }
    
    public ArrayList<OrderDto> viewAllOrders()throws ClassNotFoundException, SQLException{
        ArrayList<OrderDto> orderDtos = orderModel.viewAllOrders();
        return orderDtos;
    }
    
}
