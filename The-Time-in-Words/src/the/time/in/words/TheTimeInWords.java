/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.time.in.words;



import java.util.*;

public class TheTimeInWords {
    
   public static String TimeInWords(int h, int m){
 String[] words = {
      "zero",
      "one",
      "two",
      "three",
      "four",
      "five",
      "six",
      "seven",
      "eight",
      "nine",
      "ten",
      "eleven",
      "twelve",
      "thirteen",
      "fourteen",
      "fiveten",
      "sixten",
      "seventen",
      "eighten",
      "ninten",
      "twenty",
    };
     String tmp = "";
     
     String str = m < 10 ? "minute" : "minutes";
     if (m == 0)
     {
        System.out.println(words[h] + " o' clock");
     } 
     else if (m == 15)
     {
      System.out.println("quarter past " + words[h]);
     } 
     else if (m == 30)
     {
      System.out.println("half past " + words[h]);
     } 
     else if (m > 0 && m < 30)
     {
      tmp = m <= 20 ? words[m] : words[20] + " " + words[m % 10];
      System.out.println(tmp + " " + str + " past " + words[h]);
     } 
     else if (m == 45)
     {
      System.out.println("quarter to " + words[++h]);
     } 
     else if (m > 30 && m < 60)
     {
      m = 60 - m;
      tmp = m <= 20 ? words[m] : words[20] + " " + words[m % 10];
      System.out.println(tmp + " " + str + " to " + words[++h]);
     }
      else
     {
        return " Incorrect time input " ;
        
     }
       String r=tmp;
       return r;
    

}

    public static void main(String[] args) {
      
     
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the hour ");
    int h = sc.nextInt();
    System.out.println("Enter the minute ");
    int m = sc.nextInt();
    String result = TimeInWords(h,m);
    System.out.println(" Thats the time in words");


    }
    
}
//    in.close();
//     System.out.println(" The time is " +result);

// public static String timeInWords(int h, int m) {
//    
//        String[] words = {
//      "zero",
//      "one",
//      "two",
//      "three",
//      "four",
//      "five",
//      "six",
//      "seven",
//      "eight",
//      "nine",
//      "ten",
//      "eleven",
//      "twelve",
//      "thirteen",
//      "fourteen",
//      "fiveten",
//      "sixten",
//      "seventen",
//      "eighten",
//      "ninten",
//      "twenty",
//        };
//    
//     String tmp = "";
//     String result=tmp;
//     String str = m < 10 ? "minute" : "minutes";
//     if (m == 0)
//     {
//        return words[h] + " o' clock";
//     } 
//     else if (m == 15)
//     {
//      return "quarter past " + words[h];
//     } 
//     else if (m == 30)
//     {
//      return "half past " + words[h];
//     } 
//     else if (m > 0 && m < 30)
//     {
//      tmp = m <= 20 ? words[m] : words[20] + " " + words[m % 10];
//      return tmp + " " + str + " past " + words[h];
//     } 
//     else if (m == 45)
//     {
//      return "quarter to " + words[++h];
//     } 
//     else if (m > 30 && m < 60)
//     {
//      m = 60 - m;
//      tmp = m <= 20 ? words[m] : words[20] + " " + words[m % 10];
//      return tmp + " " + str + " to " + words[++h];
//     }
//      else
//     {
//        return " Incorrect time input " ;  
//     }
//    //    return result;
//
//    }