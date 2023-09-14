public class challengeThree {

   public static void main(String[] args) {

      // Challenge #3: Create a Pascal Triangle
      for (int i = 0; i < 4; i++) {

         for (int j = 4; j > i; j--) {
            System.out.print(" ");
         }

         for (int x = 0; x < (2 * i + 1); x++) {
            if (x == 0) {
               System.out.print(1);
            } else if (x == (2 * i + 1) - 1) {
               System.out.print(1);
            } else {
               System.out.print(i + 1);
            }

         }

         System.out.println();

      }

   }

}