package Live_coding_questions;
import java.util.*;
class Faculty{
    private String name;
    private double salary;

    public Faculty(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double bonus(float percent){
        return (percent/100)*this.salary;
    }
    public String getDetails(){
        return name + ", " + salary;
    }
    public String getDetails(float percent){
        return name + ", " + salary + ", " + bonus(percent);
    }
}

class Hod extends Faculty{
    private String personalAssistant;
    public Hod(String name, double salary, String pa){
        super(name, salary); //calling the constructor of parent class using "super" keyword
        this.personalAssistant = pa;
    }
    public double bonus(float percent){
        return super.bonus(percent)*0.5;
    }
    public String getDetails(){
        return super.getDetails() + ", " + personalAssistant;
    }
    public String getDetails(float percent){
        return super.getDetails() + ", " + personalAssistant;
    }
}
public class week3prob1 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
            Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
            System.out.println(obj1.getDetails());
            System.out.println(obj1.getDetails(10));
            System.out.println(obj2.getDetails());
            System.out.println(obj2.getDetails(10));
        }
    }
    }
