
package Lec5_Exercise;
import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Integer.parseInt(s.nextLine());
        int count=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if((n%i)==0)count++;
        }
        if(count>=2){
            System.out.print(n+" is not a prime number");
        }
        else System.out.print(n+" is a prime number");
    }
}
