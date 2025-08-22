
package Lec5_Exercise;
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number from 1 to 10: ");
        int n=Integer.parseInt(s.nextLine());
        while(n<1||n>10){
            System.out.print("Invalid number, please try again: ");
            int a=Integer.parseInt(s.nextLine());
            n=a;
        }
        System.out.println("You entered the number: "+n);
    }
}
