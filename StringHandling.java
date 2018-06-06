/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class StringHandling {
    public static void main(String args[])
    {
        String str1 = "Test";
        String str2 = new String("java");
        String str4 = "Rashmi";
        
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str4 : " + str4);
        
        String str3 = str1 + str2 + str4;
        str3 = str2.concat(str1).concat(str4);
        System.out.println("str3 : " + str3);
        System.out.println("str4 : " + str4);
        
        int len = str2.length();
        System.out.println("len : " + len);
        
        
        str2 = "Test string";
        for (int i =0; i<=str2.length()-1; i+=2)
            // or i<=str2.length()-1
        {
            //System.out.println(str2.charAt(i));
            //char at () will specify each char at each line
            System.out.print(str2.charAt(i) + " ");
    }
        System.out.println("");
        
        //string reversed
        for(int i=str2.length()-1; i>=0 ;i--)
        {
            
            System.out.print(str2.charAt(i) + " ");
            System.out.println("");
            
            
        }
        str2 = "Java";
            str3 = "java";
            if(str2.equals(str3))
            //if(str2.equalsIgnoreCase(str3))
            {
                System.out.println("Equal Strings");
            }
            else
            {
                System.out.println("Different Strings");
            }
            
            //will give us the diff of values if there is any change
            str2 = "Java";
            str3 = "Java";
            System.out.println(str2.compareTo(str3));
            System.out.println(str2.compareToIgnoreCase(str3));
            
            // shows if the condition is true or false in case of string
            System.out.println(str2.endsWith("vb"));
            
            
            // to check the position of character or string
            // here 4 is the from 4 position it will start searching
            // last index show the last i it has
            str2 = "This is a test string";
            int p;
            p = str2.indexOf('i');
            p = str2.indexOf("test");
            p = str2.indexOf('i',4); 
            p = str2.lastIndexOf('i');
             System.out.println("p : " + p);
             
             //replacing
             System.out.println(str2.replace('i' , '$'));
             
             //find how many words are there.
             int wordCount = 0;
             for(int i=0; i<str2.length(); i++)
             {
                 if(Character.isWhitespace(str2.charAt(i)))
                 {
                     wordCount++;      
                 }          
             }
             System.out.println("wordCount : " + wordCount++);
             
             StringBuffer str5 = new StringBuffer("Hello There");
             int len1 = str5.length();
             
             //add to previous string
             System.out.println("str5 : " + str5);
             str5.append("good afternoon");
             
             
             // replce the char in string
             str5.setCharAt(1, '&');
             //insert value to the string
             str5.insert(4, "@@@");
             System.out.println("str5 : " + str5);
             
             
             //str5=(StringBuffer)"this is a boring class";
             System.out.println(str5.reverse());
             
             
             
             
              String str6[] = "this is a test".split(" ");
              String fstr6="";
                for(int i =str6.length-1 ; i>=0 ;i--)
                {
                    fstr6 +=str6[i]+" ";
                }
                System.out.println(fstr6);
    }    
            }
                   
            
            
       
     
   
