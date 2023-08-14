package practice;
import java.util.*;


public class input_output {
    public static void main(String[] arr){
        System.out.println("Enter a number");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.println("Entered number: " + a);
        }

    }
}
