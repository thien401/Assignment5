
package Lec5_Exercise;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Integer.parseInt(s.nextLine());
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(i*n));
        }
    }
}
