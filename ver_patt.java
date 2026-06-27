


import java.util.*;
class ver_patt{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name of countries");
        String a1 = sc.nextLine();
        String a2 = sc.nextLine();
        String a3 = sc.nextLine();
        int b1 = a1.length();
        int b2 = a2.length();
        int b3 = a3.length();
        int c = Math.max(b1, Math.max(b2, b3));
        
        for (int d = 0; d<c; d++) {
            
            if (d<b1){
                System.out.print(a1.charAt(d) + "\t");
            } 
            else{
                System.out.print("\t");
            }
            if (d<b2){
                System.out.print(a2.charAt(d) + "\t");
            } 
            else{
                System.out.print("\t");
            }
            if (d<b3) {
                System.out.print(a3.charAt(d));
            }
            System.out.println();
        }
        
    }
}
