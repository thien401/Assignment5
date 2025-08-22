
package Lec5_Exercise;
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number(press 0 to stop): ");
        int n=Integer.parseInt(s.nextLine());
        int sum=0;
        int i=0;
        while(n!=0){
            System.out.print("Enter a number(press 0 to stop): ");
            int a=Integer.parseInt(s.nextLine());
            sum=sum+a;
            n=a;
            i++;
        }
        System.out.println("The average is: "+(sum/(i-1)));
    }
}
