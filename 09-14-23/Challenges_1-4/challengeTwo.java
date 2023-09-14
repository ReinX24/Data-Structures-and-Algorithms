public class challengeTwo {

   public static void main(String[] args) {

      // Challenge #2: Create a program that creates a triangle and where each row is
      // made up of a number.
      for (int i = 0; i < 4; i++) {

         for (int j = 4; j > i; j--) {
            System.out.print(" ");
         }

         for (int x = 0; x < (2 * i + 1); x++) {
            System.out.print(i + 1);
         }

         System.out.println();

      }

   }

}