/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classday7;

import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class Books {
    int bookId;
    String bookTitle;
    int bookRating;
    
    Books(){
        this.bookId = 0;
        this.bookTitle="Unknown";
        this.bookRating=0;
    }
    Books(int bookID, String bookTitle, int bookRating){
        this.bookId = bookID;
        this.bookTitle= bookTitle;
        this.bookRating= bookRating;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getBookRating() {
        return bookRating;
    }

    public void setBookRating(int bookRating) {
        this.bookRating = bookRating;
    }
     void displayInfo(){
         System.out.println("BookID :" + this.bookId + "\n book Title: " + this.bookTitle+ "\n Book Rating : " + this.bookRating);
         
         
     }
}
class bookTitleComparator implements Comparator<Books>{

@Override
public int compare(Books b1, Books b2){
    return b1.bookTitle.compareToIgnoreCase(b2.bookTitle);
}
}
   class bookRatingComparator implements Comparator<Books>{
        
       @Override
        public int compare(Books b1, Books b2){
            if(b1.bookRating==b2.bookRating)
                return 0;
            else if (b1.bookRating < b2. bookRating)
                return 1;
            else
                return -1;
        }
   }
            
            
            
       
               
    
    

