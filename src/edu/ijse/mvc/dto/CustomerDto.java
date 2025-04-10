/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author Chirath
 */
public class CustomerDto {
    private String custID;
    private String custTitle;
    private String custName;
    private String dob;
    private double salary;
    private String custAddresss;
    private String city;
    private String province;
    private int postalCode;

    public CustomerDto(String custID, String custTitle, String custName, String dob, double salary, String custAddresss, String city, String province, int postalCode) {
        this.custID = custID;
        this.custTitle = custTitle;
        this.custName = custName;
        this.dob = dob;
        this.salary = salary;
        this.custAddresss = custAddresss;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the custTitle
     */
    public String getCustTitle() {
        return custTitle;
    }

    /**
     * @param custTitle the custTitle to set
     */
    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the custAddresss
     */
    public String getCustAddresss() {
        return custAddresss;
    }

    /**
     * @param custAddresss the custAddresss to set
     */
    public void setCustAddresss(String custAddresss) {
        this.custAddresss = custAddresss;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the postalCode
     */
    public int getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "CustId = " + custID + ", CustTitle = " + custTitle + ", CustName =" + custName + ", DOB = " + dob + ", Salary = " + salary + ", CustAddress = " + custAddresss + ", City = " + city + ", Province = " + province + ", PostalCode = " + postalCode;
    }
     
}
