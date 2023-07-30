package week7;

class Parrot{
      void fly(){
             System.out.println("Parrot can fly....");
      }
}
public class aq_7_2_13 {
      public static void main(String args[]) {
            Parrot p=null;
            try {
                  p.fly();
            }
            catch(NullPointerException e) {
                   System.out.println("There is a null pointer exception");
            }
            catch(Exception e) {
                   System.out.println("There is an exception");
            }
      }
}