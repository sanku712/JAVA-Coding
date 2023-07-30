import java.util.*;
class Array2
{
    public static void main(String[] args) throws Exception
    {
        int a[] = new int[10];

        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Display Elements: ");

        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        int sum = 0;

        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of array elements: "+sum);
        int max=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Max Array elements: "+max);
    }
}