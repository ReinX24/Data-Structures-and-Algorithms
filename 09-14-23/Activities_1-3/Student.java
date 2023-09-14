public class Student {

   // Creating different variables that will be used by our Student objects
   String fullName;
   String studCourse;

   String studSubject;
   String univInstructor;
   String univSchool;
   String univAddress;

   double dataStrucGrade;
   double oopGrade;
   double progTwoGrade;

   double gradeAverage;
   String gradeRemarks;

   // Constructor for Activity 1 and 2
   Student(String fullName, String studCourse, String studSubject, String univInstructor, String univSchool,
         String univAddress) {
      this.fullName = fullName;
      this.studCourse = studCourse;
      this.studSubject = studSubject;
      this.univInstructor = univInstructor;
      this.univSchool = univSchool;
      this.univAddress = univAddress;
   }

   // Constructor for Activity 3
   Student(String fullName, String courseAndYear, double dataStrucGrade, double oopGrade, double progTwoGrade) {
      this.fullName = fullName;
      this.studCourse = courseAndYear;
      this.dataStrucGrade = dataStrucGrade;
      this.oopGrade = oopGrade;
      this.progTwoGrade = progTwoGrade;
   }

   // Calculating the grade for Activity 3
   void evalGrade() {
      gradeAverage = (dataStrucGrade + oopGrade + progTwoGrade) / 3.0;
      if (gradeAverage < 74) {
         gradeRemarks = "FAILED!";
      } else {
         gradeRemarks = "PASSED";
      }
   }

   // Printing the Student's information for Activity 1 and 2
   void printStudentInfo() {
      System.out.println("*************************************************");
      System.out.println("Fullname: " + this.fullName);
      System.out.println("Course: " + this.studCourse);
      System.out.println("*************************************************");
      System.out.println("Subject: " + this.studSubject);
      System.out.println("Instructor: " + this.univInstructor);
      System.out.println("*************************************************");
      System.out.println("School: " + this.univSchool);
      System.out.println("Address: " + this.univAddress);
      System.out.println("*************************************************");
   }

   // Printing the Student's information for Activity 3
   void printStudentInfoGrade() {
      System.out.println("*************************************************");
      System.out.println("Student Name: " + this.fullName);
      System.out.println("Course & Year: " + this.studCourse);
      System.out.println("*************************************************");
      System.out.println("Data Struc Grade: " + this.dataStrucGrade + " | OOP Grade: " + this.oopGrade);
      System.out.println("Prog:02 Grade: " + this.progTwoGrade);
      System.out.println("*************************************************");
      System.out.println("General Average: " + (double) Math.round(this.gradeAverage * 100) / 100 + " Remarks: "
            + this.gradeRemarks);
      System.out.println("*************************************************");
   }

}