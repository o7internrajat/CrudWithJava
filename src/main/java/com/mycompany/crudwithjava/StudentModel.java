/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudwithjava;

/**
 *
 * @author HP Nav
 */
public class StudentModel {
    private int id;
    private String name, email;
    
    public StudentModel(){
    }
     public StudentModel(int id, String name, String email){
         this.id=id;
         this.name=name;
         this.email = email;
    }
    
    public int getId(){
        return id;
    }
     public String getName(){
        return name;
    }
      public String getEmail(){
        return email;
    }
       public void setId(int id){
          this.id = id;
       
      }
      public void setName(String name){
          this.name = name;
       
      }
      public void setEmail(String email){
          this.email = email;
       
      }
}
