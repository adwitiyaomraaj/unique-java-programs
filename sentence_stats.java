import java.util.*;

class sentence_stats {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        String input = sc.nextLine().trim();
        
        String[] sentences = new String[10];
        int senCount = 0;
        String currentSentence = "";
        
        // Step 1: Break the paragraph into individual sentences
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Checking for the valid terminators based on the prompt
            if (ch == '.' || ch == '?' || ch == '!' || ch == ',') {
                if (senCount < 10) {
                    // .trim() removes any hanging spaces before the punctuation
                    sentences[senCount] = currentSentence.trim(); 
                    senCount++;
                }
                currentSentence = ""; // Reset for the next sentence
            } else {
                currentSentence += ch;
            }
        }
        
        int[] vCount = new int[senCount];
        int[] wCount = new int[senCount];
        
        // Step 2: Count vowels and words for each sentence
        for (int i = 0; i < senCount; i++) {
            String s = sentences[i];
            int vowels = 0;
            int words = 0;
            int inWordFlag = 0; // Using an int flag instead of a boolean
            
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                
                // Vowel check
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowels++;
                }
                
                // Word count check using the flag
                if (c != ' ') {
                    if (inWordFlag == 0) {
                        words++;
                        inWordFlag = 1; // Mark that we are currently inside a word
                    }
                } else {
                    inWordFlag = 0; // Reset when we hit a space
                }
            }
            
            vCount[i] = vowels;
            wCount[i] = words;
        }
        
        // Step 3: Print the First Table
        System.out.println("OUTPUT :");
        System.out.println("Sentence\tNo. of Vowels\tNo. of Words");
        for (int i = 0; i < senCount; i++) {
            System.out.println((i + 1) + "\t\t" + vCount[i] + "\t\t" + wCount[i]);
        }
        
        System.out.println();
        
        // Step 4: Print the Second Table (The Bar Chart)
        System.out.println("Sentence\tNo. of words/vowels");
        for (int i = 0; i < senCount; i++) {
            System.out.print((i + 1) + "\t\t");
            
            // Print V's (Multiplied by 3 due to the 1:3 scale)
            for (int v = 0; v < vCount[i] * 3; v++) {
                System.out.print("V");
            }
            System.out.println();
            
            // Align the W's directly under the V's
            System.out.print("\t\t"); 
            
            // Print W's (Multiplied by 3 due to the 1:3 scale)
            for (int w = 0; w < wCount[i] * 3; w++) {
                System.out.print("W");
            }
            System.out.println();
        }
        System.out.println("Scale used: 1:3");
    }
}