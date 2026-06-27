


import java.util.*;
class max_4{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no.");
        int a = sc.nextInt();
        int b = 0,c=0;
        do{
           b = sc.nextInt();
           
           if(b>a)
              a=b;
           c++;
        
        }while(c!=3);
        System.out.println("maximum no. ="+a);
    }
}