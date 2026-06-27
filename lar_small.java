


import java.util.*;
 class lar_small {
      
      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String a = sc.nextLine() + " "; 
        String Ls = "";  
        String Ss = "";
        String Cs = "";   
        
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            
            if (c != ' ') {
                Cs += c;
            } else {
                if (Ss.equals("") && Ls.equals("")) {
                    Ss = Cs;
                    Ls = Cs;
                } else {
                    if (Cs.length() < Ss.length()) {
                        Ss = Cs;
                    }
                    if (Cs.length() > Ls.length()) {
                        Ls = Cs;
                    }
                }
                Cs = "";
            }
        }
        
        System.out.println("The largest word is: " + Ls);
        System.out.println("The smallest word is: " + Ss);
    }
}
