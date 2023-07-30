import java.io.*;
class LeapYear
{
    public static void main(String[] args) throws Exception
    {
        InputStreamReader in = new InputStreamReader(System.in);
        int year;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter year: ");
        year = Integer.parseInt(br.readLine());
        if(year%4==0){
            System.out.println("The given year leap year: ");

        }else{
            System.out.println("This is not a leap year");
        }
    }
}