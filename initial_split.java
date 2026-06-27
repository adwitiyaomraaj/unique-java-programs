
import java.util.*;

class initial_split {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence or word:");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        System.out.print("Initials: ");
        
        for (int i = 0; i < words.length; i++)
            System.out.print((words[i].charAt(0)) + " ");
    }
}