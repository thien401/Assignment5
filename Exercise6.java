
package Lec5_Exercise;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Integer.parseInt(s.nextLine());
        int sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.println("The sum of the digits is: "+sum);
    }
}
