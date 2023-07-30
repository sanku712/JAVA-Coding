import java.util.*;
class Array3
{
    public static void main(String[]args) throws Exception
    {
        int a[] = new int[10];              //declaration
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");

        int n = sc.nextInt();

        System.out.println("Enter Array elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Even Array Elements: ");

        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            System.out.println(a[i]);
        }
        System.out.println("Odd Elements: ");
        for(i=0;i<n;i++)
        {
            if(a[i]%2==1)
            System.out.println(a[i]);
        }
    }
}