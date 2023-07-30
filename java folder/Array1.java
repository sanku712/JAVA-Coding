import java.util.*;
class Array1
{
    public static void main(String[]args)
    {
        int a[] = new int[10];
        int i;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the no of elements: ");
        int n =in.nextInt();

        System.out.println("Enter the elements: ");

        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Display the Array elements: ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}