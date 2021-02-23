import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class BinarySearchDemo {
   private static int binarySearch(int[] numbers, int key) {
      // Variables to hold the low, middle and high indices
      // of the area being searched. Starts with entire range.
      int low = 0;
      int mid = numbers.length / 2;
      int high = numbers.length - 1;
   
      // Loop until "low" passes "high"
      while (high >= low) {
         // Calculate the middle index
         mid = (high + low) / 2;

         // Cut the range to either the left or right half,
         // unless numbers[mid] is the key
         if (numbers[mid] < key) {
            low = mid + 1;
         }
         else if (numbers[mid] > key) {
            high = mid - 1;
         }
         else {
            return mid;
         }
      }
   
      return -1; // not found
   }

   // Main program to test the binarySearch() method
   public static void main(String[] args) {
      //declaring an array of 10
      int [] barray= new int [10];
      
      Scanner scnr = new Scanner(System.in);
      for (int i = 0; i < barray.length; i++) {
           System.out.println("Enter a number: " + (i+1)); 
           int input=scnr.nextInt(); 
           barray[i]=input;
      }
      System.out.println();
      
      System.out.print("Enter an integer value from the above list to search: ");
      int key = scnr.nextInt();
      int keyIndex = binarySearch(barray, key);
      
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
          Arrays.sort(arr); //sorting the array
      System.out.print(arr[i]+" ");
      }
       System.out.println();
      System.out.println("Enter an integer value from the above list to search:");
     int bkey2 = scnr.nextInt(); //scaning for user input
     
     int keyIndex2 = binarySearch(arr,bkey2);
      if (keyIndex2 == -1) {
         System.out.println(bkey2 + " was not found.");
      }
      else {
         System.out.printf("Found %d at index %d.\n", bkey2, keyIndex2);
      }
     
   }
}
