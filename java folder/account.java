import java.io.*;
class Account
{
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String acno,name;
    int bal,dep,wid;

    void open() throws Exception
    {
        System.out.println("ENTER ACCOUNT INFORMATION: ");

        System.out.println("Input Account NO      :");
        acno=br.readLine();

        System.out.println("Input Customer Name    :");
        name=br.readLine();

        System.out.println("Input Principal Amount:    ");
        bal=Integer.parseInt(br.readLine());
    }
    void display()
    {
        System.out.print("ACCOUNT INFORMATION");
        System.out.print("A/C No = "+acno);
        System.out.print("Name =  "+name);
        System.out.print("Balance = "+bal);
        System.out.print("\n");
    }

    void deposit() throws Exception
    {
        System.out.print("Enter the amount to Deposit: ");

        dep=Integer.parseInt(br.readLine());

        bal = bal+dep;

        display();
    }

    void Withdraw() throws Exception
    {
        System.out.print("\n Enter the amount to be Withdraw: ");
        wid=Integer.parseInt(br.readLine());
        bal=bal-wid;

        display();
    }
}

class AccountMain
{
    public static void main(String[]args) throws Exception
    {
        Account a=new Account();

        int c = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(c!=5)
        {
            System.out.print("\n1)Open Account 2)Balance 3)Deposit 4)Withdraw 5)Exit: ");
            c=Integer.parseInt(br.readLine());

            switch(c)
            {
                case 1 :   a.open();  break;

                case 2 :   a.display(); break;

                case 3 :   a.deposit();  break;

                case 4 :   a.Withdraw();  break;

                case 5 :   System.exit(0);
            }
        }
        
    }
}