


import java.util.*;
class arrange {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String a = sc.nextLine().toUpperCase();
        char p = a.charAt(a.length() - 1);
        
        if (p!='.' && p!='?' && p!='!') {
            System.out.println("Invalid sentence. It must end with '.', '?' or '!'");
        } else {
            a = a.substring(0, a.length() - 1);
            String[] word = a.split(" ");
            
            for (int i = 0; i < word.length - 1; i++) {
                for (int j = i + 1; j < word.length; j++) {
                    if (word[i].length() > word[j].length() || 
                       (word[i].length() == word[j].length() && word[i].compareTo(word[j]) > 0)) {
                        String t = word[i];
                        word[i] = word[j];
                        word[j] = t;
                    }
                }
            }
            System.out.println("Original Sentence: " + a + p);
            System.out.print("Converted Sentence: ");
            for (int i = 0; i < word.length; i++) {
                System.out.print(word[i] + " ");
            }
            System.out.println(p);
        }
    }
}
