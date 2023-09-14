import java.util.Scanner;

public class DataStruc02 {

   public static void main(String[] args) {

      // Asking the user for certain inputs and passing them to a Student object
      // constructor, printing statement will be similar to Activity 1
      Scanner usrInp = new Scanner(System.in);

      System.out.print("Enter Fullname?: ");
      String fullName = usrInp.nextLine();

      System.out.print("Enter Course?: ");
      String studCourse = usrInp.nextLine();

      System.out.print("Enter Subject?: ");
      String studSubject = usrInp.nextLine();

      System.out.print("Enter Instructor?: ");
      String univInstructor = usrInp.nextLine();

      String univSchool = "Universidad de Dagupan";
      String univAddress = "Arellano St., Brgy Pantal, Dagupan City";

      Student studentOne = new Student(fullName, studCourse, studSubject, univInstructor, univSchool, univAddress);
      studentOne.printStudentInfo();

      usrInp.close();
   }

}