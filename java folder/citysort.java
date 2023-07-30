/*write a program in java to accept name of cities from the users and sort them in ascending order */
import java.io.*;
class CitySort
{
    public static void main(String [] args) throws Exception
    {
        int i,j;

        String city[] = new String[5];

        String s1,s2,temp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 5 cities");

        for(i=0;i<5;i++)
        {
            city[i]= br.readLine();
            System.out.println();  
        }
        System.out.println("\nSorted Cities : ");



        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(city[i].compareTo(city[j])>0)
                {
                    temp=city[i];
                    city[i]=city[j];
                    city[j]=temp;
                }
            }
            System.out.println(city[i]);
        }
    }
}