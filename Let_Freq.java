


import java.util.*;
class Let_Freq {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the sentence:");
        String a = sc.nextLine();
        a = a.toUpperCase(); 
        int[] freq = new int[26]; 
        
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            
            if (c >= 'A' && c <= 'Z') {
                int x =(int)c - (int)'A'; 
                freq[x]= freq[x] + 1;
            }
        }
        System.out.println("Character"+"\t"+"Frequency");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'A') + "\t" +"\t" + freq[i]);
            }
        }
    }
}
