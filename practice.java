


import java.util.*;
class practice{
     
     public static void main(String args[]){
        
        System.out.println("enter the values of a,b and c respectively");
        
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        if(a>c){
            if(a<b){
                System.out.println("The second smallest no. is="+" "+a);
            }
             }
        if(a>b){
            if(a<c){
                System.out.println("The second smallest no. is="+" "+a);
            }
             }
        if(b>a){
            if(b<c){
                System.out.println("The second smallest no. is="+" "+b);
            }
        }
        if(b>c){
            if(b<a){
                System.out.println("The second smallest no. is="+" "+b);
            }
             }
         if(c>a){
            if(c<b){
                System.out.println("The second smallest no. is="+" "+c);
        }
        } 
        if(c>b){
            if(c<a){
                System.out.println("The second smallest no. is="+" "+c);
            }
             }
        else
        System.out.println("Please do not enter same value");
        
        
    } 
} 
