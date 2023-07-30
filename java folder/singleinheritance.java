import java.io.*;
class Employee
{
    int eno;
    String name, desg;

    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void getdata() throws Exception
    {
        System.out.println("Enter the Employee Details: ");

        System.out.println("Employee Id: ");
        eno=Integer.parseInt(br.readLine());

        System.out.println("Employee Name:   ");
        name=br.readLine();
        System.out.println("Enter Designation:   ");
        desg=br.readLine();
    }
}

class Salary extends Employee
{
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    double basic,hra,da,tra,ts,it,pf,ns,d;

    void getdata() throws IOException
    {   
        
        System.out.println("Enter Salary Details: ");
        System.out.println("Enter basic pay:  ");
        basic= Double.parseDouble(br.readLine());

    }
    double total()
    {
        hra =basic*0.10;
        tra=basic*0.08;
        da=basic*0.05;
        ts=basic+hra+da+tra;

        return ts;
    }

    double ded()
    {
        pf=ts*0.12;
        it=ts*0.10;

        d=pf+it;

        return d;
    
    }
    double net()
    {
        ns=total()-ded();

        return ns;
    }

    void putdata()
    {
        System.out.println("EMP Id = "+eno);
        System.out.println("NAME= "+name);
        System.out.println("DESG= "+desg);
        System.out.println("BASIC = "+basic);
        System.out.println("TOTAL SALARY= "+total());
        System.out.println("DEDUCIOTN = "+ded());
        System.out.println("NET SALARY = "+net());
    }
}

class Single_Salary
{
    public static void main(String[]args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Salary s=new Salary();

        s.getdata();
        s.putdata();
    }
}