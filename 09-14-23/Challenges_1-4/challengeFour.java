public class challengeFour {

   public static void main(String[] args) {

      // Challenge #4: Create a Diamond
      for (int i = 0; i < 4; i++) {

         for (int j = 4; j > i; j--) {
            System.out.print(" ");
         }

         for (int x = 0; x < (2 * i + 1); x++) {
            System.out.print("*");
         }

         System.out.println();

      }

      for (int i = 2; i >= 0; i--) {

         for (int j = 4; j > i; j--) {
            System.out.print(" ");
         }

         for (int x = 0; x < (2 * i + 1); x++) {
            System.out.print("*");
         }

         System.out.println();

      }

   }

}