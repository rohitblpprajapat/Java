package Live_coding_questions;
import java.util.*;
class Employee{
    private String name;
    private String[] projects;
    public Employee(String name, String[] projects){
        this.name = name;
        this.projects = projects;
    }
    public Employee(Employee e){
        this.name = e.name;
        this.projects = Arrays.copyOf(e.projects, e.projects.length);
    }
    String getNmae(){
        return this.name;
    }
    String getProjects(int i){
        return this.projects[i];
    }

    void setName(String s){
        this.name = s;
    }
    void setProjects(int i, String p){
        this.projects[i] = p;
    }
    
}
public class week2prob2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] proj = {"proj1", "proj2", "proj3"};
        Employee e1 = new Employee("surya", proj);
        Employee e2 = new Employee(e1);
        e2.setName(sc.next());
        e2.setProjects(0,sc.next());
        System.out.println(e1.getNmae()+ "  :"+e1.getProjects(0));
        System.out.println(e2.getNmae()+ "  :"+e2.getProjects(0));

    }
    
}
