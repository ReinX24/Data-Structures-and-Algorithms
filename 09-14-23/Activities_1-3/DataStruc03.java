import java.util.Scanner;

public class DataStruc03 {

   public static void main(String[] args) {

      // Asking the user for this Name, Course & Year, Data Struc Grade, OOP Grade,
      // and then Prog 2 Grade. After asking for grades, we then calculate the
      // average, check if the student passes (grades < 74 equals to failed), and then
      // print the Student's information
      Scanner usrInp = new Scanner(System.in);

      System.out.print("Enter Student Name?: ");
      String fullName = usrInp.nextLine();

      System.out.print("Enter Course & Year?: ");
      String studCourse = usrInp.nextLine();

      System.out.print("Enter Data Struc Grade?: ");
      double dataStrucGrade = usrInp.nextInt();

      System.out.print("Enter OOP Grade?: ");
      double oopGrade = usrInp.nextInt();

      System.out.print("Enter Prog: 02 Grade?: ");
      double progTwoGrade = usrInp.nextInt();

      Student studentOne = new Student(fullName, studCourse, dataStrucGrade, oopGrade, progTwoGrade);

      studentOne.evalGrade();
      studentOne.printStudentInfoGrade();

      usrInp.close();
   }

}