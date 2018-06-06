/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class ExceptionHandling {
    public static void main(String args[])
    {
        try
        {
        int n = Integer.parseInt("123");
        System.out.println("n :" + n );
        n = n/n;
         System.out.println("n :" + n );
         
         //to throw the exception.. we have set the limit and after this limit it will throw the exception
         if (n <150)
         {
             throw new NumberFormatException();
         }
         
         
         int numbers[]= {10,20,30};
         System.out.println("numbers[5] : " + numbers[5]);
         
        }
        
        catch(ArithmeticException e)
        {
            System.err.println(e);
            //e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println(e);
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        finally
        {
            System.out.println(" the finally block");
        }
            }
    
}
