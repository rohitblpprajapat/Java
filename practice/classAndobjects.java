package practice;

class Student1 {
String name;
int age;
public void getInfo() {
    System.out.println("The name of this Student is " + this.name);
    System.out.println("The age of this Student is " + this.age);
    }
}
public class classAndobjects {
    public static void main(String args[]) {
    Student1 s1 = new Student1();
    s1.name = "Neck";
    s1.age = 24;
    s1.getInfo();
    Student1 s2 = new Student1();
    s2.name = "Noah";
    s2.age = 22;
    s2.getInfo();
}
}
