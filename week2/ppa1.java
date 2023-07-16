package week2;

//  Consider the program given below. Complete the program according to the instructions provided in the comments such that the program satisfies the given test cases.

import java.util.*;
class Rectangle{
    int w;    //width
    int h;    //height
//LINE-1: write the function setw(int) to initialize w
    void setw(int width){
        w = width;
    }
 // Function to set the value of h
    void seth(int height){
        h = height;
    }
// Function to calculate and return the area of the rectangle
    int area() {
       return w * h;
    }
    

}
public class ppa1{
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());
        Rectangle r = new Rectangle();
        r.setw(w);
        r.seth(h);
        int area = r.area();
        System.out.print(area);
    }
}