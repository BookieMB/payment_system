/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peymentsystem;

/**
 *
 * @author Lenovo
 */

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
//public class dbConnection extend javax.swing.JFrame{
public class dbConnection{
    public Connection conn;
    public Statement state;
    
    public dbConnection()
    {
       // initComponents();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payment_finals?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            state = conn.createStatement();
            JOptionPane.showMessageDialog(null, "Connected");
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e+ "Error in connection to Database!");
        }
    }

    void conn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
