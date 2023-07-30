package week7;

public class aq_7_2_20{
    public static void main(String args[]) {
        try {
            throw new NullPointerException ("Hello");
        }
        catch(ArithmeticException e){
             System.out.print("B");
        }
    }
}