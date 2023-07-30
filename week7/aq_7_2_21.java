package week7;

class A extends Exception{
     A(String str){
         super(str);
     }
}
public class aq_7_2_21{
      public static void main(String args[]) {
          try {
               throw new A("Hello");//Line 1
          }
          catch(A e){//Line 2
               System.out.print("B");
          }
      }
}
