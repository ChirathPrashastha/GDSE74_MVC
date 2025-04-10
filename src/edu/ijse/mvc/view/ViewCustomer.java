/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.mvc.view;

import edu.ijse.mvc.Controller.CustomerController;
import edu.ijse.mvc.dto.CustomerDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chirath
 */
public class ViewCustomer extends javax.swing.JFrame {
    
    DefaultTableModel dtm;
    CustomerController customerController;

    /**
     * Creates new form ViewCustomer
     */
    public ViewCustomer() {
        
        customerController = new CustomerController();
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        custIdLbl = new javax.swing.JLabel();
        custIdTxt = new javax.swing.JTextField();
        custTitleTxt = new javax.swing.JTextField();
        custTitleLbl = new javax.swing.JLabel();
        custNameLbl = new javax.swing.JLabel();
        custNameTxt = new javax.swing.JTextField();
        dobTxt = new javax.swing.JTextField();
        dobLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        salaryLbl = new javax.swing.JLabel();
        salaryTxt = new javax.swing.JTextField();
        custAddressTxt = new javax.swing.JTextField();
        custAddressLbl = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        cityLbl = new javax.swing.JLabel();
        provinceLbl = new javax.swing.JLabel();
        provinceTxt = new javax.swing.JTextField();
        postalCodeTxt = new javax.swing.JTextField();
        postalCodeLbl = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTbl = new javax.swing.JTable();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE CUSTOMER");

        custIdLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        custIdLbl.setText("Customer ID");

        custIdTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        custTitleTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        custTitleLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        custTitleLbl.setText("Customer Title");

        custNameLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        custNameLbl.setText("Customer Name");

        custNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dobTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dobLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        dobLbl.setText("Date of Birth");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel6.setText("YYYY-MM-DD");

        salaryLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        salaryLbl.setText("Salary");

        salaryTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        custAddressTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        custAddressLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        custAddressLbl.setText("Customer Address");

        cityTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cityLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        cityLbl.setText("City");

        provinceLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        provinceLbl.setText("Province");

        provinceTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        postalCodeTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        postalCodeLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        postalCodeLbl.setText("Postal Code");

        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        customerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(customerTbl);

        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dobLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salaryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custAddressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(postalCodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(custIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(provinceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(provinceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(postalCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custAddressTxt)
                                .addComponent(custNameTxt)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(custIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custIdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(custTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custTitleTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(custNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salaryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custAddressLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(custAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cityLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(provinceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(provinceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postalCodeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        deleteCustomer();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        updateCustomer();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        addCustomer();
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        searchCustomer();
    }//GEN-LAST:event_searchBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JLabel custAddressLbl;
    private javax.swing.JTextField custAddressTxt;
    private javax.swing.JLabel custIdLbl;
    private javax.swing.JTextField custIdTxt;
    private javax.swing.JLabel custNameLbl;
    private javax.swing.JTextField custNameTxt;
    private javax.swing.JLabel custTitleLbl;
    private javax.swing.JTextField custTitleTxt;
    private javax.swing.JTable customerTbl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel postalCodeLbl;
    private javax.swing.JTextField postalCodeTxt;
    private javax.swing.JLabel provinceLbl;
    private javax.swing.JTextField provinceTxt;
    private javax.swing.JLabel salaryLbl;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        String[] columns = {"CustID","CustTitle","CustName","DOB","salary","CustAddress","City","Province","PostalCode"};
        dtm = new DefaultTableModel(columns,0);
        customerTbl.setModel(dtm);
        
        try {
            ArrayList<CustomerDto> CustomerDtos = customerController.viewAllCustomer();
            for(CustomerDto dto : CustomerDtos){
                Object[] rawData = {dto.getCustID(),dto.getCustTitle(),dto.getCustName(),dto.getDob(),dto.getSalary(),dto.getCustAddresss(),dto.getCity(),dto.getProvince(),dto.getPostalCode()};
                dtm.addRow(rawData);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void clearForm(){
        custIdTxt.setText("");
        custTitleTxt.setText("");
        custNameTxt.setText("");
        dobTxt.setText("");
        salaryTxt.setText("");
        custAddressTxt.setText("");
        cityTxt.setText("");
        provinceTxt.setText("");
        postalCodeTxt.setText("");
    }

    private void addCustomer() {
        CustomerDto customerDto = new CustomerDto(custIdTxt.getText(), custTitleTxt.getText(), custNameTxt.getText(), dobTxt.getText(), Double.parseDouble(salaryTxt.getText()), custAddressTxt.getText(), cityTxt.getText(), provinceTxt.getText(), Integer.parseInt(postalCodeTxt.getText()));
        
        try {
            String respond = customerController.addCustomer(customerDto);
            JOptionPane.showMessageDialog(this, respond);
            loadTable();
            clearForm();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void deleteCustomer() {
        String custId = custIdTxt.getText();
        
        try {
            String respond = customerController.deleteCustomer(custId);
            JOptionPane.showMessageDialog(this, respond);
            loadTable();
            clearForm();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void updateCustomer() {
        CustomerDto customerDto = new CustomerDto(custIdTxt.getText(), custTitleTxt.getText(), custNameTxt.getText(), dobTxt.getText(), Double.parseDouble(salaryTxt.getText()), custAddressTxt.getText(), cityTxt.getText(), provinceTxt.getText(), Integer.parseInt(postalCodeTxt.getText()));
        
        try {
            String respond = customerController.updateCustomer(customerDto);
            JOptionPane.showMessageDialog(this, respond);
            loadTable();
            clearForm();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void searchCustomer() {
        
        try {
            CustomerDto customerDto = customerController.searchCustomer(custIdTxt.getText());
            dtm.setRowCount(0);
            Object[] rawData = {customerDto.getCustID(),customerDto.getCustTitle(),customerDto.getCustName(),customerDto.getDob(),customerDto.getSalary(),customerDto.getCustAddresss(),customerDto.getCity(),customerDto.getProvince(),customerDto.getPostalCode()};
            dtm.addRow(rawData);
            customerTbl.setModel(dtm);
            clearForm();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
}
