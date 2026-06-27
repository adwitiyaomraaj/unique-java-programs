


import java.util.*;
class freq_str{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);    
        
        System.out.println("Enter the sentence");
        String a = sc.nextLine();
        System.out.println("What to check:");
        String b = sc.nextLine();
        int i=0;
        int c = a.indexOf(b);   
        int l = b.length();
        
        while (c!=-1) {
            i++;
            c = a.indexOf(b, c + l);
        }
        System.out.println("Frquency of the word is="+i);
    }
}
