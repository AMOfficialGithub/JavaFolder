import java.util.Scanner;

public class NumberPattern {
   // TODO: Write recursive printNumPattern() method
  
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in);
      //taking two user inputs
      int num1;
      int num2;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      //calling the method with the user input as arguments
      printNumPattern(num1, num2); 
   } 
   
   public static void printNumPattern(int num1,int num2) 
{
    if (num1 == 0 || num1 < 0)
    { 
        System.out.print(num1 + " ");
        return; 
         
    }
   System.out.print(num1 + " ");
   printNumPattern(num1 - num2, num2);
   System.out.print(num1 + " ");
    
} 
    
} 

