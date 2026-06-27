


import java.util.Scanner;

public class Strontio {

    
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

        int sumNum = sumOfDigits(num);
        int square = num * num;
        int sumSquare = sumOfDigits(square);

        
        if (sumNum + sumSquare == num)
            
            System.out.println(num + " is a Strontio Number.");
        else
            System.out.println(num + " is NOT a Strontio Number.");
    }
}
