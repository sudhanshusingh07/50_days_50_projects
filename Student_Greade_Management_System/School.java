import java.util.*;
public class School {
    private ArrayList<Student> studentList;

    public School(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void removeStudent(int roll_number){
        Student studentToRemove = null;

        for(Student student : studentList){
            if(student.getroll_number() == roll_number){
                studentToRemove = student;
                break;
            }
        }
         if(studentToRemove != null){
            studentList.remove(studentToRemove);
    }
}

     public void displayStudents(){
    for(Student student : studentList){
        System.out.println(student);
    }
   }

}