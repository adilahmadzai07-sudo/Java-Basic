package d2hex;
import java.util.Scanner;
/**
 *
 * @author adil ahmadzai
 */
public class D2Hex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the decimal number(between 1-15): ");
        int decimal = input.nextInt();
        int value = decimal;
        String hex = "";

        if (value == 0) {
            hex = "0";
            System.out.println(decimal + " in decimal would be " + hex + " in hexa decimal");
        }
        
        else if(value >= 16){
            System.out.println("In valid input!");
        }
        
        else {
            while (value != 0) {
                int remainder = value % 16;
                if (remainder < 10) {
                        hex = remainder + hex;
                } 
                else {
                    hex = (char)('A' + (remainder - 10)) + hex;
                }
                value = value / 16;
            }
            System.out.println(decimal + " in decimal would be " + hex + " in hexa decimal");

        }

    
    }
    
}
