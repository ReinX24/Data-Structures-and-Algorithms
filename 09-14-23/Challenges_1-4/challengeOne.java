import java.util.Scanner;

public class challengeOne {

   public static void main(String[] args) {

      // Challenge #1: Create a program that takes a number and then create a square
      // using that number as its sides.
      Scanner usrInp = new Scanner(System.in);

      System.out.print("Enter no. if rows?: ");
      int sqrSize = usrInp.nextInt();

      for (int i = 0; i < sqrSize; i++) {
         for (int j = 0; j < sqrSize; j++) {
            System.out.print("*");
         }
         System.out.println();
      }

      usrInp.close();

   }

}