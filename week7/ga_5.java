package week7;

public class ga_5 {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
             int c=a/b;
             System.out.println("Quotient is "+c);
        }
        catch (ArithmeticException ae){
              System.out.println("ArithmeticException handled");
        }
        catch (Exception ae){                                           
             System.out.println("Exception handled");
        }
        
   }
}

// catch blocks orders should be in more specific to less specific.  
//In this code if we exchange the catch block that causes second block unreachable and throws compilation error
