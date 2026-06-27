


import java.util.*;

public class WordGenerator {
    
    
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+-=[]{}|;':\",.<>?/`~";
    
    
    private static final String ALL_CHARACTERS = UPPERCASE + LOWERCASE + DIGITS + SPECIAL_CHARACTERS;
    
    
    private static final int WORD_LENGTH = 8;

    
    public static void main(String[] args) {
        
        generateWords(WORD_LENGTH, "");
    }

    
    private static void generateWords(int length, String currentWord) {
        
        if (currentWord.length() == length) {
            
            System.out.println(currentWord);
            
            return;
        }
        
        
        for (int i = 0; i < ALL_CHARACTERS.length(); i++) {
            generateWords(length, currentWord + ALL_CHARACTERS.charAt(i));
        }
    }
}
