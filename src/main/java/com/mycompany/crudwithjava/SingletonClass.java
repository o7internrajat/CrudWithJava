/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudwithjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP Na
 */
public class SingletonClass {
    Connection connection = null;
   
    private static SingletonClass singletonClass = null;
    private SingletonClass(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
            if(connection != null){
            String createStudent = "CREATE TABLE IF NOT EXISTS student(id INT AUTO_INCREMENT, name VARCHAR(255), email VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement ps = connection.prepareStatement(createStudent);
            ps.execute();
            
            }
        }catch(SQLException sqlException){
            System.out.println("sqlException "+ sqlException.getMessage());
        }
    }
    public static SingletonClass getInstance(){
        if(singletonClass == null){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
