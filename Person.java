/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectday3;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Person {
    String name;
    String address;
    int age;
       Scanner in = new Scanner(System.in);
       
       //default constructor
       Person(){
           name = "Unknown";
           address = "unkown";
           age = 1;
       }
       Person(String name, String address, int age){
           this.name = name;
           this.address = address;
           this.age = age;
                   
       }
     void setName(){
      
       System.out.println("enter Name : ");
         this.name = in.nextLine();
     }
    String getName(){
        return name;
    }
    
    void setAddress(){
      System.out.println("enter address : ");
      this.address = in.nextLine();
    }
    String getAddress(){
        return address;
    }
    void setAge(){
        System.out.println("enter age : ");
        this.age = Integer.parseInt(in.nextLine());
    }
    int getAge(){
        return age;
        
    }
    
    void setData(){
        setName();
        setAddress();
        setAge();
    }
    
    @Override
    public String toString(){
        String data = "Name : " + name + "\n Address : " + address + "\n Age : " + age;
         return data;
    }
    }
    