import java.util.Scanner;

public class DataStuct07 {

   public static void main(String[] args) {
      // Create a 1 dimensional array that will contain 10 elements of integer type.
      // Use scanner method to accept integer values for the array.
      // Display the array contents

      // 1 liner version (looks cool but is not readable, not recommended)
      // Scanner userInput = new Scanner(System.in); int[] numArray = new int[10];
      // System.out.print("Index #0: "); numArray[0] = userInput.nextInt();
      // System.out.print("Index #1: "); numArray[1] = userInput.nextInt();
      // System.out.print("Index #2: "); numArray[2] = userInput.nextInt();
      // System.out.print("Index #3: "); numArray[3] = userInput.nextInt();
      // System.out.print("Index #4: "); numArray[4] = userInput.nextInt();
      // System.out.print("Index #5: "); numArray[5] = userInput.nextInt();
      // System.out.print("Index #6: "); numArray[6] = userInput.nextInt();
      // System.out.print("Index #7: "); numArray[7] = userInput.nextInt();
      // System.out.print("Index #8: "); numArray[8] = userInput.nextInt();
      // System.out.print("Index #9: "); numArray[9] = userInput.nextInt();
      // System.out.print("[" + numArray[0] + ", " + numArray[1] + ", " + numArray[2]
      // + ", " + numArray[3] + ", " + numArray[4] + ", " + numArray[5] + ", " +
      // numArray[6] + ", " + numArray[7] + ", " + numArray[8] + ", " + numArray[9] +
      // "]");

      // 13 line version (balance between being concise and readable)
      Scanner userInput = new Scanner(System.in);
      int[] numArray = new int[10];
      System.out.print("Index #0: ");
      numArray[0] = userInput.nextInt();
      System.out.print("Index #1: ");
      numArray[1] = userInput.nextInt();
      System.out.print("Index #2: ");
      numArray[2] = userInput.nextInt();
      System.out.print("Index #3: ");
      numArray[3] = userInput.nextInt();
      System.out.print("Index #4: ");
      numArray[4] = userInput.nextInt();
      System.out.print("Index #5: ");
      numArray[5] = userInput.nextInt();
      System.out.print("Index #6: ");
      numArray[6] = userInput.nextInt();
      System.out.print("Index #7: ");
      numArray[7] = userInput.nextInt();
      System.out.print("Index #8: ");
      numArray[8] = userInput.nextInt();
      System.out.print("Index #9: ");
      numArray[9] = userInput.nextInt();
      System.out.print("[" + numArray[0] + ", " + numArray[1] + ", " + numArray[2] + ", " + numArray[3] + ", "
            + numArray[4] + ", " + numArray[5] + ", " + numArray[6] + ", " + numArray[7] + ", " + numArray[8] + ", "
            + numArray[9] + "]");

      /*
       * // 5 line version, best solution since it is short and easily modifiable
       * for (int i = 0; i < numArray.length; i++) {
       * System.out.print("Index #" + i + ": ");
       * numArray[i] = userInput.nextInt();
       * }
       */
      // printArray(numArray);

      userInput.close();

   }

   // Method that prints the array elements horizontally
   public static void printArray(int[] numArray) {
      System.out.print("[");
      for (int i = 0; i < numArray.length; i++) {
         if (i == numArray.length - 1) {
            System.out.print(numArray[i]);
         } else {
            System.out.print(numArray[i] + ", ");
         }
      }
      System.out.println("]");
   }

}