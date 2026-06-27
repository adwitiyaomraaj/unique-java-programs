


import java.util.*;
class number_word {
    
    public static void main(String[] args) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", 
                          "Five", "Six", "Seven", "Eight", "Nine"};

        
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = sc.nextInt();   

        String answer = "";          

        
        while (number > 0) {
            int digit = number % 10;         
            answer = words[digit] + " " + answer;  
            number = number / 10;            
        }

        
        System.out.println("You entered: " + answer);
    }
}
