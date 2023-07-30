package practice;
// program to print nth fibonacci no.
import java.util.*;
class nthfibo{
    int n;
    public int fibo(int n){
        int x = 0;
        int y = 1;
        if (n == 0){
            return x;
        }
        for (int i=2; i <= n; i++){
            int z = x + y;
            x = y;
            y = z;
        }
        return y;
    }
    
}
public class fivonacci_no {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        nthfibo f = new nthfibo();
        
        System.out.println(f.fibo(n));
    }
    }
}