import java.util.*;
public class palindrome{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = 454,temp,r;
        int sum = 0;

        temp = n;

        while(n!=0)
        {
            r = n%10; //Getting remainder
            sum = (sum*10) + r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }

}