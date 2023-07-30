import java.util.Scanner;
public class Bill
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String productname = input.nextLine();
        System.out.println("Enter the price of: "+productname + ": ");
        double price = input.nextDouble();
        System.out.println("Enter the quantity of: "+productname + ": ");
        int quantity = input.nextInt();

        double billamount = price * quantity;

        double discount = 0;
        if(billamount >= 1000)
        {
            discount = 0.1 * billamount;
        }
        else{
            discount = 0.05 * billamount;
        }
        System.out.println("product name: "+productname);
        System.out.println("price per unit: "+price);
        System.out.println("quantity: "+quantity);
        System.out.println("bill amount " +billamount);
        System.out.println("Discount: "+discount);

    }
}