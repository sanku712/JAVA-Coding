import java.io.*;
class EvenOdd
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(br.readLine());
        if(num%2==0)
        System.out.println("Even number: ");
        if(num%2==1)
        System.out.println("Odd number");
        if(num==0)
        System.out.println("Zero");
    }
}