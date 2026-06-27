


import java.util.*;
class buzz_no{
    
    public static void main(String args[]){
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the digits");
         System.out.println("The max digit is till 5");
         System.out.println("Enter the digit 1 if you want to enter a 1 digit no.");
         System.out.println("Enter the digit 2 if you want to enter a 2 digit no.");
         System.out.println("Enter the digit 3 if you want to enter a 3 digit no.");
         System.out.println("Enter the digit 4 if you want to enter a 4 digit no.");
         System.out.println("Enter the digit 5 if you want to enter a 5 digit no.");
         int a = sc.nextInt();
         
         switch(a)
         {
             case 1:
                 System.out.println("Enter the no.");
                 int b=sc.nextInt();
                 
                 if(b>9||b<0){
                 System.out.println("it is not a one digit no.");
                 System.out.println("PROGRAM TERMINATES HERE");
                 System.exit(0);
                }
                if(b/7==1||b%7==0)
                System.out.println("It is a buzz no.");
                else
                System.out.println("It is not a buzz no."); 
                
                break;
                
             case 2:
                 System.out.println("Enter the no.");
                    int c=sc.nextInt();
                 if(c>99||c<10){
                 System.out.println("It is not a two digit no.");
                 System.out.println("PROGRAM TERMINATES HERE");
                 System.exit(0);
                }
                
                int e= c%10;
                if(c%7==0||e==7)
                System.out.println("It is a buzz no.");
                else
                System.out.println("It is not a buzz no."); 
                
                break;
                    
            case 3:
                System.out.println("Enter the no.");
                int f=sc.nextInt();
                 if(f>999||f<100){
                 System.out.println("It is not a three digit no.");
                 System.out.println("PROGRAM TERMINATES HERE");
                 System.exit(0);
                }
                int g= f/10;
                int h= g/10;
                int i= h%10;
                if(f%7==0||i==7)
                System.out.println("It is a buzz no.");
                else
                System.out.println("It is not a buzz no.");
                
                break;
                
                case 4:
                    System.out.println("Enter the no.");
                    int j=sc.nextInt();
                 if(j>9999||j<1000){
                 System.out.println("It is not a four digit no.");
                 System.out.println("PROGRAM TERMINATES HERE");
                 System.exit(0);
                }
                int k= j/10;
                int l= k/10;
                int m= l/10;
                int n= m%10;
                if(j%7==0||n==7)
                System.out.println("It is a buzz no.");
                else
                System.out.println("It is not a buzz no.");
                
                break;
                
                case 5:
                    System.out.println("Enter the no.");
                    int o=sc.nextInt();
                 if(o>99999||o<10000){
                 System.out.println("It is not a five digit no.");
                 System.out.println("PROGRAM TERMINATES HERE");
                 System.exit(0);
                }
                int p= o/10;
                int q= p/10;
                int r= q/10;
                int s= r/10;
                int t= s%10;
                if(o%7==0||1==7)
                System.out.println("It is a buzz no.");
                else
                System.out.println("It is not a buzz no.");
                
                break;
                
                default:
                    System.out.println("Wrong choice");
                
         }
    }
}
