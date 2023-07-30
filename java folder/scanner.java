import java.util.Scanner;

class ScannerInput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double sal;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Enter your salary: ");
        sal = scanner.nextDouble();

        System.out.println("Enter your name: "+ name);
        System.out.println(" your age: "+ age);
        System.out.println("your salary: " +sal);



    }
}