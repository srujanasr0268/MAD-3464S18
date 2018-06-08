/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classday7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macstudent
 */
public class ArrayListTest {
    public static void main(String args[]){
        ArrayList<String> productsName = new ArrayList<String>();
        
        productsName.add("Projector");
        productsName.add("Excel");
        productsName.add("contigo");
        productsName.add("Apple");
        
        productsName.add(2, "Oracle");
        
        if(productsName.contains("oracle")){
            productsName.remove("oracle");
                    }else{
            System.err.println("Buy Oracle first");
        
        
        }
        
     for(String raman : productsName){
         System.out.println(raman);
    }
     
     Collections.sort(productsName);
     System.out.println("=====");
     
     for(String raman : productsName){
         System.out.println(raman);
     
    }
     
    ArrayList<Books>library = new ArrayList<Books>();
   Books book1 = new Books(101, "the sky is falling ", 9);
   Books book2 = new Books (102, "Pride and Prejudice", 5);
   Books book3 = new Books(103, "the monk", 5);
   Books book4 = new Books(105, "Courage",2);
   
   library.add(book1);
   library.add(book2);
   library.add(book3);
   library.add(book4);
   
   
   for (Books bk : library){
       bk.displayInfo();
   }
    System.out.println("No.of books in library : " + library.size());
    
     if(library.contains(book2)){
         library.remove(book2);
         
     }
     System.out.println("no.of books in library : " + library.size());
     library.add(2, new Books(120, "Pearls" , 11));
     
     
     Collections.sort(library, new bookTitleComparator());
        for(Books bk : library){
            bk.displayInfo();
            
     }
    Collections.sort(library, new bookRatingComparator());
    for (Books bk : library){
        bk.displayInfo();
    }
    }
}
        
        
        
      
   
