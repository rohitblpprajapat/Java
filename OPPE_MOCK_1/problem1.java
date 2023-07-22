package OPPE_MOCK_1;
import java.util.*;
class Employee{
    String name;
    String[] projects;

    public Employee(String name, String[] projects){
        this.name = name;
        this.projects = projects;
    }
    public Employee(Employee other){
        this.name = other.name;
        this.projects = Arrays.copyOf(other.projects, other.projects.length);
    }
    public void setName(String n){
        this.name = n;
    }
    public void setProject(int i, String p){
        projects[i] = p;
    }
    public String getName(){
        return name;
    }

    public String getProject(int i){
        return projects[i];
    }
}
public class problem1 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String[] proj = {"PJ1", "PJ2", "PJ3"};
            Employee e1 = new Employee("Surya", proj);
            Employee e2 = new Employee(e1);
            e2.setName(sc.next());
            e2.setProject(0, sc.next());
            System.out.println(e1.getName()+ ": " + e1.getProject(0));
            System.out.println(e2.getName()+ ": " + e2.getProject(0));
        }

    }
    
}
