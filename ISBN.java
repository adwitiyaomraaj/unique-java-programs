


import java.util.*;
class ISBN {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN number (10 or 13 digits): ");
        String isbn = sc.nextLine();

        
        if (isbn.length() == 10) {
            int sum = 0;

            
            for (int i = 0; i < 9; i++) {
                char ch = isbn.charAt(i);
                if (!Character.isDigit(ch)) {
                    
                    System.out.println("Invalid ISBN-10: contains non-digit.");
                    
                    return;
                }

                int digit = ch - '0';
                sum = sum + digit * (i + 1);
            }

            char last = isbn.charAt(9);
            if (last == 'X' || last == 'x') {
                sum = sum + 10 * 10;
            } else if (Character.isDigit(last)) {
                sum = sum + (last - '0') * 10;
            } else {
                System.out.println("Invalid ISBN-10: last character is not digit or X.");
                return;
            }

            if (sum % 11 == 0) {
                System.out.println("It is a VALID ISBN-10.");
            } else {
                System.out.println("It is an INVALID ISBN-10.");
            }
        }

        
        else if (isbn.length() == 13) {
            int sum = 0;

            for (int i = 0; i < 12; i++) {
                int digit = isbn.charAt(i) - '0';

                if (i % 2 == 0) {
                    sum = sum + digit;
                } else {
                    sum = sum + digit * 3;
                }
            }

            int checkDigit = (10 - (sum % 10)) % 10;
            int lastDigit = isbn.charAt(12) - '0';

            if (checkDigit == lastDigit) {
                System.out.println("It is a VALID ISBN-13.");
            } else {
                System.out.println("It is an INVALID ISBN-13.");
            }
        }

        
        else {
            System.out.println("ISBN must be either 10 or 13 digits.");
        }

    }
}
