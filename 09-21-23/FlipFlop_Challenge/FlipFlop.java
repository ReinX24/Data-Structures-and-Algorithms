public class FlipFlop {

   public static void main(String[] args) {
      for (int i = 1; i <= 100; i++) {
         // if the current number is an odd number, print FLIPFLOP
         // else, just print the number (i)
         if (i % 2 != 0) {
            System.out.println("FLIPFLOP");
         } else {
            System.out.println(i);
         }
      }
   }

}