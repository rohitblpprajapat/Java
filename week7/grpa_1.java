package week7;

import java.util.*;
//Define DivisionException class here
class DivisionException extends Exception{
    public String toString(){
        return "Division by 3 is not allowed";
    }
}
public class grpa_1 {
 
    //Define divide(int a, int b) here
    public static int divide(int a, int b) throws DivisionException{
        if (b == 3){
            throw new DivisionException();
        }else{
            return a/b;
        }
    }

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        int x = sc.nextInt();
           int y = sc.nextInt();
           
           //call divide method here

            try{
                int c = divide(x, y);
                System.out.println(c);
            } catch (DivisionException e){
                System.out.println(e);
            }
    }
   }
} 