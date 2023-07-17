package practice;

class Student {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println("this is name of student :"+ this.name);
        System.out.println("this is age of the Student :"+ this.age);
    }
}

public class OOPs {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "prakash";
        s1.age = 22;

        Student s2 = new Student();
        s2.name = "pooja";
        s2.age = 20;

        s1.printInfo();
        s2.printInfo();

    }
}