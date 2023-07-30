package week7;
import java.util.logging.*;

class SomeClass {
    public void loglt(){
        Logger.getGlobal().info("this is first message");
    }
}
public class ga_1 {
    public static void main(String[] args){
        new SomeClass().loglt(); //calling the method of another object to avoid error in compilation
        Logger.getGlobal().log(Level.FINE,"second message");
        Logger.getGlobal().setLevel(Level.OFF);
        try{
            throw new ArithmeticException();
        }
        catch(Exception e){
            Logger.getGlobal().log(Level.SEVERE, "third message");
        }
    }
}
