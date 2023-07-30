class Pattern{
    public static void main(String []args)
    {
        int i,j,k;
        for(i=1;i<=3;i++)
        {
            for(j=3;j>i;j++)
            {
                System.out.println(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.println("* ");
            }
            System.out.println("\n");
        }
    }
}