public class DataStruct06 {

   public static void main(String[] args) {

      int x = 48;
      int xStatus;

      if (x < 50) {
         xStatus = 1;
      } else if (x > 150) {
         xStatus = 2;
      } else if (x >= 50 && x <= 149) {
         xStatus = 3;
      } else {
         xStatus = 4;
      }

      switch (xStatus) {

         case 1:
            System.out.println("Integer is less than 50!");
            break;

         case 2:
            System.out.println("Integer is greater than 150!");
            break;

         case 3:
            System.out.println("Integer is between 50 and 149!");
            break;

         case 4:
            System.out.println("Unknown value!");
            break;

      }

   }

}