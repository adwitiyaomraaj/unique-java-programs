


import java.util.*;
class pronic{
    
    void pronic_no(int n){ 
       int a = 0;
     
     for(int i = 1; i<= n; i++) {
            
            if  (i * (i + 1) == n){
                a=1;
                break;
             }
     }
     if(a==1)
     
     System.out.println("It is a pronic no");
     else
     System.out.println("It is not a pronic no");
   }
     
     public static void main(String args[]){
     pronic ob= new pronic();
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     ob.pronic_no(sc.nextInt());
   }
}
