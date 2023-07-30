package practice;
import java.util.*;
import java.util.Scanner;

public class armstrongNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (armstrong(a)){
            System.out.println("Armstrong Number");
        }else{
            System.out.print("Not an Armstrong number.");
        }
    }

    public static boolean armstrong(int n){
        int num = n;
        int digits = countDigits(n);
        int sum = 0;

        while (n != 0){
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n/=10;
        }
        return sum == num;
    }

    public static int countDigits(int n){
        int c = 0;
        while (n != 0){
            n /= 10;
            c++;
        }
        return c;
    }

}