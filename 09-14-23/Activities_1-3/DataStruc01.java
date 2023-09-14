public class DataStruc01 {

   public static void main(String[] args) {

      // Creating variables that will be passed into our Student constructor and
      // printing the Student object's information
      String fullName = "Solis, Rein Aldwin E.";
      String studCourse = "BSIT - 2nd Year";
      String studSubject = "Data Structures and Algorithms";
      String univInstructor = "Mr. Yuri R. Rancudo, MIT";
      String univSchool = "Universidad de Dagupan";
      String univAddress = "Arellano St., Brgy Pantal, Dagupan City";

      Student studentOne = new Student(fullName, studCourse, studSubject, univInstructor, univSchool, univAddress);
      studentOne.printStudentInfo();
   }

}