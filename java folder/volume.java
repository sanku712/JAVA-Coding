import java.util.Scanner;

class test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final double PI = 3.14;
        double r,v;
        System.out.println("Enter radius: ");
        r = in.nextDouble();

        v = 4/3 * PI * r * r * r;
        System.out.println("volume= "+v); 
    }
}