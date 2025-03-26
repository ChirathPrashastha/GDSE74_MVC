/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.Controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Chirath
 */
public class ItemController {
    private ItemModel itemModel;

    public ItemController() {
        itemModel = new ItemModel();
    }
    
    public String addItem(ItemDto dto) throws ClassNotFoundException, SQLException{
        String respond = itemModel.addItem(dto);
        return respond;
    }
    
    public String updateItem(ItemDto dto) throws ClassNotFoundException, SQLException{
        String respond = itemModel.updateItem(dto);
        return respond;
    }
    
    public String deleteItem(String itemCode) throws ClassNotFoundException, SQLException{
        String respond = itemModel.deleteItem(itemCode);
        return respond;
    }
    
    public ItemDto searchItem(String itemCode) throws ClassNotFoundException, SQLException{
        ItemDto respond = itemModel.searchItem(itemCode);
        return respond;
    }
    
    public ArrayList<ItemDto> getAllItem() throws  SQLException, ClassNotFoundException{
        ArrayList<ItemDto> resp = itemModel.getAll();
        return resp;
    }
    
}
