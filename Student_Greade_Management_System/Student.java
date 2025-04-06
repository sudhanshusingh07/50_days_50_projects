public class Student {
    private String name;
    private int roll_number;
     private float[] grades;

    public Student(String name, int roll_number,float[] grades){
        this.name = name;
        this.roll_number = roll_number;
        this.grades = grades;
    }


    public int getroll_number(){
        return roll_number;
    }

     public double get_average() {
        float sum = 0;
        for (float grade : grades) {
            sum += grade;
        }
        return  sum / grades.length;
    }

    public String getResult() {
        return get_average() >= 50 ? "Passed" : "Failed";
    }


     @Override
   public String toString(){
   return name + ", average grade: " + get_average() + ", Result: " + getResult();
   }
}
