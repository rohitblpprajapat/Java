package Live_coding_questions;
import java.util.*;
class Student{
    String name;
    double[] marks;
    public Student(String name, double[] marks){
        this.name = name;
        this.marks = marks;
    }
    String getName(){
        return name;
    }
    double findTotal(){
        return (marks[0] + marks[1] + marks[2] );
    }
}
public class week2prob1 {
    public static String getMax(Student[] student){
        double max_marks = 0.0;
        String topper = "";
        for (Student i : student){
            double total = i.findTotal();
            if (total > max_marks){
                max_marks = total;
                topper = i.getName();
            }
        }
        return topper;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            Student[] arr = new Student[3];
            for(int i = 0; i < 3; i++){
                String name = sc.next();
                double[] m = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
            }
            System.out.println(getMax(arr));
        }
    }
    
}
