import java.util.Scanner;

public class StringArrayChallenge {

   public static void main(String[] args) {

      // Create an array of Strings and print each element in the array
      Scanner userInput = new Scanner(System.in);
      String[] strArray = new String[5];

      for (int i = 0; i < strArray.length; i++) {
         System.out.print("Enter [" + i + "]?: ");
         strArray[i] = userInput.nextLine();
      }
      printArray(strArray);
      userInput.close();
      
      // Testing printArray method, generics only work on non-primitive data type arrays
      Integer[] numArr = {1, 2, 3, 4, 5};
      Character[] charArr = {'a', 'b', 'c', 'd', 'e'};
      
      System.out.println("Integer Test");
      printArray(numArr); 
      
      System.out.println("Charater Test");
      printArray(charArr);

   }

   // Method that prints any type of array due to the usage of generics
   public static <T> void printArray(T[] paraArray) {
      System.out.print("Array Values: ");
      for (int i = 0; i < paraArray.length; i++) {
         if (i == paraArray.length - 1) {
            System.out.println("[" + paraArray[i] + "]");
         } else {
            System.out.print("[" + paraArray[i] + "], ");
         }
      }
   }

}