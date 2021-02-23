import java.util.Scanner;
import java.util.Random;
import java.util.*; 

public class LinearSearchDemo
{
   private static int linearSearch(int[]numbers, int key)
   {
   for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] == key) {
            return i;
         }
      }
      return -1; // not found
   }

   // Main program to test the linearSearch() method
   public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);
         //User input Array
      int[] numbers = new int[10]; 
      for (int i = 0; i < numbers.length; i++) {
           System.out.println("Enter a number: " + (i+1)); 
           int input=scnr.nextInt(); 
           numbers[i]=input;
      }
      //Converts the array to a String
      System.out.println(Arrays.toString(numbers));
      
      System.out.print("Enter an integer value from the above list to search: ");
      int key = scnr.nextInt();
      int keyIndex = linearSearch(numbers, key);

      if (keyIndex == -1) {
         System.out.println(key + " was not found.");
      }
      else {
         System.out.printf("Found %d at index %d.\n", key, keyIndex);
      }
      //SubTask2
       //Creating Random object
         Random ran = new Random();
         //Generated Array
         int [] arr = new int [100];
      System.out.println("Randomly generated numbers:");
      for(int i =0; i<arr.length; i++){
          arr[i] = ran.nextInt(100); //Storing the random integers in the array to 100
      System.out.print(arr[i]+" ");
      }
      System.out.println();
      System.out.println("Enter an integer value from the above list to search:");
     int key2 = scnr.nextInt(); //scaning for user input
     
     int keyIndex2 = linearSearch(arr, key2);

      if (keyIndex2 == -1) {
         System.out.println(key + " was not found.");
      }
      else {
         System.out.printf("Found %d at index %d.\n", key2, keyIndex2);
      }
      
   }
}