
package Lec5_Exercise;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter height: ");
        int h=Integer.parseInt(s.nextLine());
        System.out.print("Enter width: ");
        int w=Integer.parseInt(s.nextLine());
        for(int i=1;i<=h;i++){
            for(int j=0;j<=w;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
