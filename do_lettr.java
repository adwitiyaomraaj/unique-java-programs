


import java.util.*;
class do_lettr{
    
    public static void main(String[] arga){
        int i= 0;
        int b = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the sentence");
        String a = sc.nextLine();
        String e = a.toUpperCase();
        System.out.println("UPDATED SENTENCE:"+" "+e);
        int l = e.length();
        
        while(i<l-1){
            char c = e.charAt(i);
            char d = e.charAt(i+1);
              
              if(c==d){
                b++;
            }
            i++;
        }
        System.out.println("No. of double letter sequence:"+" "+b);
    }
}