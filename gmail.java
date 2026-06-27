


import java.util.*;
class gmail{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the gmail id");
        String a = sc.nextLine();
        
        if(a.endsWith("@gmail.com"))
            System.out.println( a + " "+"is a valid gmail id");
        else
            System.out.println( a + " " +"is not a valid gmail id");
    }
}