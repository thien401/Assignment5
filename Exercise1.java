
package Lec5_Exercise;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Integer.parseInt(s.nextLine());
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of numbers from 1 to "+n+" is: "+sum);
    }
}
