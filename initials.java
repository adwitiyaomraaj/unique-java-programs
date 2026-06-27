
import java.util.*;

class initials {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence or word:");
        String s = sc.nextLine();
        s = " "+s;
        System.out.print("Initials: ");
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
                System.out.print((s.charAt(i + 1)) + " ");
        }
    }
}