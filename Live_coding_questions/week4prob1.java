package Live_coding_questions;
import java.util.*;

abstract class UPIPayment{
    abstract void payment();
    abstract void rewards();

}

class PhonePay extends UPIPayment{
    private int amount;
    public PhonePay(int a){
        this.amount = a;
    }
    public void payment(){
        System.out.println("Phone pay:Payment success:");
        rewards();
    }
    public void rewards(){
        if (this.amount < 500){
            System.out.println("Sorry no rewards");
        }else if(this.amount >= 500){
            System.out.println("10 off on next mobile rc");
     }
    }
}
class Paytm extends UPIPayment{
    private int amount;
    public Paytm(int a){
        this.amount = a;
    }
    public void payment(){
        System.out.println("Paytm:Payment success:");
        rewards();
    }
    public void rewards(){
        if (this.amount < 500){
            System.out.println("Sorry no rewards");
        }else if(this.amount >= 500){
            System.out.println("10 off on next DTH rc");
     }
    }
}
class UPIUser{
    public void transferAndGetReawards(UPIPayment obj){
        obj.payment();

    }
}
public class week4prob1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        UPIUser u = new UPIUser();
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        u.transferAndGetReawards(new PhonePay(a1));
        u.transferAndGetReawards(new Paytm(a2));
    }
}
