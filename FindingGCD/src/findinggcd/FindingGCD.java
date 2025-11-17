package findinggcd;
import java.util.Scanner;
/**
 *
 * @author adil ahmadzai
 */
public class FindingGCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");    
        int n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 1;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }

        System.out.println("The gcd of " + n1 + " and " + n2 + " is: " + gcd);
    
    }
    
}
