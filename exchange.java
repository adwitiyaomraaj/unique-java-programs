


import java.util.*;
class exchange
{
    
    public static void main(String args[]) 
    {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter String 1: ");
        String s1 = in.nextLine();
        System.out.println("Enter String 2: ");
        String s2 = in.nextLine();
        String a = "";
        int len = s1.length();
        
        if(s2.length() == len)
        {
            
            for (int i = 0; i < len; i++) 
            {
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(i);
                a = a + ch1 + ch2;
            }
            System.out.println(a);
        }
        else
        {
             System.out.println("Strings should be of same length");
        }
    }
}