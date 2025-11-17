package salestax;
import java.util.Scanner;
/**
 *
 * @author adil ahmadzai
 */
public class SalesTax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the product price: ");
        double price = input.nextDouble();
        System.out.print("Enter the tax rate(%): ");
        double tax_rate = input.nextDouble()/100.0;
        
        double sales_tax = price * tax_rate;
        
        System.out.println("This product sales tax is: $" + (int)(sales_tax * 100)/100.0);
    }
    
}
