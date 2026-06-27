import java.util.*;
class num_to_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (< 1000): ");
        int n = sc.nextInt();
        if (n < 0 || n >= 1000) {
            System.out.println("OUT OF RANGE");
            System.exit(0);
        }
        String[] ones = {"", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        String[] teens = {"TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};
        String[] tens = {"", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};
        String result = "";
            if (n / 100 > 0) {
                result += ones[n / 100] + " HUNDRED ";
            }
            n %= 100;
            if (n >= 10 && n < 20) {
                result += teens[n - 10];
            }
            else {
                result += tens[n / 10] + " ";
                result += ones[n % 10];
            }
        System.out.println(result.trim());
    }
}