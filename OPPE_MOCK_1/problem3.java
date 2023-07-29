package OPPE_MOCK_1;

public class problem3 {
      public static void main(String[] args) {
           int a=10,b=0;
           try{
               int c=a/b;
               System.out.println("Division is"+c);
          }
          catch (ArrayIndexOutOfBoundsException ae){
              System.out.println(ae);
         }
     }
}
