
package Lec5_Exercise;
import java.util.Scanner;
import java.util.Random;
public class Exercise11 {
    public static void main(String[] args) {
        Random r=new Random();
        int random = r.nextInt(6);
        int random1 = r.nextInt(6);
        int count=1;
        do{
            System.out.println("Roll "+count+": "+random+" and "+random1);
            int a = r.nextInt(6);
            random=a;
            int b = r.nextInt(6);
            random1=b;
            count++;
        }while(random!=random1);
        System.out.println("Roll "+count+": "+random+" and "+random1);
        System.out.println("You rolled doubles after "+(count)+" tries");
    }
}
