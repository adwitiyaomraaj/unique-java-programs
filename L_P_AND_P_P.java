


import java.util.*;
class L_P_AND_P_P  
{
    
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the Details");
        String s = sc.nextLine();
        System.out.println("Enter the Cost price and Selling price");
        int c_p = sc.nextInt();
        System.out.println("C.P="+c_p);
        int s_p = sc.nextInt();
        System.out.println("S.P="+s_p);
        
        if(s_p<c_p)
        {
            int p = c_p-s_p;
            System.out.println("loss="+p);
            float per_p= (float)(p*100)/c_p;
            System.out.println("loss="+" "+per_p+"%");             
        }
        else 
        {
            int p = s_p-c_p;
            System.out.println("Profit="+p);
            float per_p= (float)(p*100)/c_p;
            System.out.println("Profit="+" "+per_p+"%");   
        }
    }
}
