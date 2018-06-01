/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectday3;

/**
 *
 * @author macstudent
 */
public class PersonTest {
    public static void main(String arg[]){
        Person sumanth = new Person();
        sumanth.name = "sumanth";
        sumanth.address = "Toronto";
        sumanth.age = 20;
        
        System.out.println("Name : " + sumanth.name +"\n address : " + sumanth.address+"\n age : " + sumanth.age);
        
//        Person foram = new Person();
//        foram.setName();
//        String nm = foram.getName();
//        foram.setAddress();
//        String add = foram.getAddress();
//        foram.setAge();
//        int age = foram.getAge();
//        System.out.println("Name : "+ nm+ "\nAddress : " + add + "\nAge : " + age);
//        
//        Person anu = new Person();
//        anu.setData();
//        System.out.println(anu.toString());
//        
        Person aman = new Person();
         System.out.println(aman.toString());
         
         Person rimpal = new Person();
         System.out.println(rimpal.toString ());        
    }
}
