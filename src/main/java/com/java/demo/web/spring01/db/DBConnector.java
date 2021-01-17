/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.web.spring01.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hoangnghiem
 */
public class DBConnector {
   public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String username = "demo";
        String password = "demo123";
        String connStr = "jdbc:mysql://207.148.127.185:3306/QL_BANHANG";
        return DriverManager.getConnection(connStr, username, password);
    } 
}
