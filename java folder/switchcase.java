import java.io.*;
class SwitchArithmetic
{
    public static void main(String[]args) throws Exception
    {
        int a=0,b=0,c=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the First number: ");
        a=Integer.parseInt(br.readLine());

        System.out.println("Enter the second number: ");
        b=Integer.parseInt(br.readLine());

        while(c!=5)
        {
            System.out.println("\n Enter: 1)Add 2)sub 3)Div 4)mul 5)Exit");
            c=Integer.parseInt(br.readLine());

            switch(c)
            {
                case 1:
                System.out.println("Addition: "+(a+b));

                case 2:
                System.out.println("Substraction: "+(a-b));

                case 3:
                System.out.println("Multiplication: "+(a*b));

                case 4:
                System.out.println("Division: "+(a/b));

                case 5:
                System.exit(0);
            }
        }
    }
}