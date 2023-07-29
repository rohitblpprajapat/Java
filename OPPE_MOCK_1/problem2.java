package OPPE_MOCK_1;

import java.util.Scanner;
class Faculty{
   private String name;
   private double salary;
   public Faculty(String name, double salary) {
       this.name = name;
       this.salary = salary;
   }
   public double bonus(float percent){
       return (percent/100.0)*salary;
   }
   // Define method getDetails()
   
    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }

    public String getDetails(float percent) {
        double bonusAmount = bonus(percent);
        return "Name: " + name + ", Salary: " + salary + ", Bonus: " + bonusAmount;
    }
}

class Hod extends Faculty {
    private String personalAssistant;

    public Hod(String name, double salary, String personalAssistant) {
        super(name, salary);
        this.personalAssistant = personalAssistant;
    }

    @Override
    public double bonus(float percent) {
        // Hod gets 50% less bonus than regular faculty
        return super.bonus(percent) * 0.5;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", " + personalAssistant;
    }

    @Override
    public String getDetails(float percent) {
        double bonusAmount = bonus(percent);
        return super.getDetails(percent) + ", " + personalAssistant + ", " + bonusAmount;
    }
}
public class problem2{
    public static void main(String[] args) {
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