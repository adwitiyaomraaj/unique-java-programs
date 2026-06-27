


import java.util.Scanner;

public class SmithNumber {

    
    static int sumOfDigits(int n) {
        int sum = 0;
        
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        
        return sum;
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sumDigitsNum = sumOfDigits(num);
        int temp = num;
        int sumDigitsFactors = 0;

        
        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0) {
                sumDigitsFactors += sumOfDigits(i);
                temp /= i;
            }
        }

        
        if (sumDigitsNum == sumDigitsFactors && num != 1)
            
            System.out.println(num + " is a Smith Number.");
        else
            System.out.println(num + " is NOT a Smith Number.");
    }
}
