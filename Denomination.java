import java.util.*;
class Denomination
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        //a = amount
        int a=sc.nextInt();
        //d = denominations
        int d[]={1000, 500, 100, 50, 20, 10, 5, 2, 1};
        System.out.println("The denominations are:");
        for(int i=0;i<d.length;i++)
        {
            if(a>=d[i])
            {
                int c=a/d[i];
                a=a%d[i];
                System.out.println(d[i]+":"+c);
            }
        }
    }
}