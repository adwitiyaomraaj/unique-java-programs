


import java.util.*;
class uni_patt{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select your choice");
        System.out.println("1: character and unicode");
        System.out.println("2:pattern");
        int a = sc.nextInt(); 
        
        switch(a){
        case 1: 
         char b;
         System.out.println("Characters   Unicode");
         
         for (b = 'A'; b <='Z'; b++) 
                System.out.println("\t"+ b+"\t" + (int)b);
    
        break;
        case 2:
         int i, j;
            for (i=1; i<=5; i++) {
            for (j=1; j<=i; j++)
           {
            System.out.print(j + "");
           }
            System.out.println();
       }
       break;
       default:
       System.out.println("Wrong choice entered");
    }
}
}