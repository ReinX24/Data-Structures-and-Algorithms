import java.util.Scanner;

public class DataStuct08 {

   public static void main(String[] args) {

      // Use scanner method to accept integer values for the array.
      Scanner userInput = new Scanner(System.in);
      // Create a 1 dimensional array that will contain 10 elements of integer type.
      int[] numArray = new int[10];
      for (int i = 0; i < numArray.length; i++) {
         System.out.print("Enter [" + i + "]?: ");
         numArray[i] = userInput.nextInt();
      }
      // Display the array contents.
      printArray(numArray);
      // Add all the elements of the array
      arrayTotal(numArray);
      userInput.close();

   }

   // Method that prints the array elements horizontally and in a certain format
   public static void printArray(int[] numArray) {
      System.out.print("Array of " + numArray.length + " integer values of: ");
      for (int i = 0; i < numArray.length; i++) {
         if (i == numArray.length - 1) {
            System.out.println("[" + numArray[i] + "]");
         } else {
            System.out.print("[" + numArray[i] + "], ");
         }
      }
   }

   // Method that adds all the elements in the array and prints the total
   public static void arrayTotal(int[] numArray) {
      int arrTotal = 0;
      for (int eachNum : numArray) {
         arrTotal += eachNum;
      }
      System.out.println("Total of Array is: " + arrTotal);
   }

}