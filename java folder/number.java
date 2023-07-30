import java.util.Scanner;
public class number {

    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        if(num>0)
        {
            System.out.println("The number is positive");

            if(num<10)
            {
                System.out.println("The number is single: ");
            }else if(num<100)
            {
                System.out.println("The number is second: ");
            }else if(num<1000)
            {
                System.out.println("The number is Three digit: ");
            }else{
                System.out.println("The number is four digit number or Higher number: ");
            }
        }else if(num<0)
        {
            System.out.println("The number is negative: ");
        }
    }
}
