package week7;

public class aq_7_2_17 {
    public static void main(String args[]) {
        int i=0, sum=0;
        try {
             sum = 10;
             for (i = -1; i < 3 ;++i)
                    sum = (sum / i);

        }
        catch(ArithmeticException e) {
               System.out.println("0");
        }
        System.out.println(sum);
  }
}
