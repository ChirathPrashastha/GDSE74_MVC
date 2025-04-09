/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.dto.OrderDto;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Chirath
 */
public class OrderModel {
   public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetails){
       String resp = "Success";
       return resp;
   }
}
