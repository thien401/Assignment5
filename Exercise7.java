
package Lec5_Exercise;
import java.util.Scanner;
import java.util.Random;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int random = r.nextInt(100);
        System.out.print("Your guess: ");
        int n=Integer.parseInt(s.nextLine());
        while(n!=random){
            if(n<random){
                System.out.println("Your number is lower than the secret number");
                System.out.print("Your guess: ");
                int a=Integer.parseInt(s.nextLine());
                n=a;
            }
            else if(n>random){
                System.out.println("Your number is higher than the secret number");
                System.out.print("Your guess: ");
                int a=Integer.parseInt(s.nextLine());
                n=a;
            }
        }
        System.out.println("Congratulations! You guessed correctly!");
    }
}
