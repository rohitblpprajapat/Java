package week2;

import java.util.Scanner;

public class ppa2 {
    //Write a program to accept a string input from user and print the characters at even indices.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        evenDisplay(s1);
    }
    //define evenDisplay(String) method here
   
    
    static void evenDisplay(String s1){
        for (int i=0;i<s1.length();i++){
            if (i%2==0){
                System.out.print(s1.charAt(i));
            }
        
        }
        
    }
}
