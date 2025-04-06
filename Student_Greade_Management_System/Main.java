public class Main {

   public static void main(String[] args) {
    School school = new School();

            float[] grades1 = new float[]{65.0f, 70.5f, 80.0f}; 
            Student student1 = new Student("Nidhi Agrawal", 101, grades1); 
            school.addStudent(student1);

            float[] grades2 = new float[]{45.5f, 50.0f, 40.0f}; 
            Student student2 = new Student("Eric G", 102, grades2); 
            school.addStudent(student2);

            float[] grades3 = new float[]{45.5f, 50.0f, 40.0f}; 
            Student student3 = new Student("Soham Patel", 103, grades3); 
            school.addStudent(student3);

            school.removeStudent(103);

            school.displayStudents();
   } 
    
}
