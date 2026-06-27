


import java.util.*;
class nested_if
{
    
    public static void main(String args[])
    {
        
        System.out.println("Enter your marks");
        
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        
        if(a>80){
            if (a<90){
                System.out.println("Very Good");
            }
            else
            System.out.println("Excellent");
        }
        if(a<80){
            System.out.println("Fine");
        }
    }
}