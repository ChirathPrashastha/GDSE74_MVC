/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.Controller;
import edu.ijse.mvc.dto.OrderDetailDto;
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
    
    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetails){
        
    }
    
}
