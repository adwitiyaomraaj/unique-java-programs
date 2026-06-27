

import java.util.*;
class mask {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        String[] mask = b.split("");
        String c = a;
        
        for (int i = 0; i < mask.length; i++) {
            String[] letter = c.split(mask[i]);
            c = "";
            for (int j = 0; j < letter.length; j++) {
                c += letter[j];
            }
        }
        
        System.out.println(c);
    }
}