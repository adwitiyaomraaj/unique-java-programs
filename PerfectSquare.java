


import java.util.Scanner;

public class PerfectSquare {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;
        boolean isPerfect = false;

        
        while (i * i <= num) {
            
            if (i * i == num) {
                isPerfect = true;
                break;
            }
            i++;
        }

        if (isPerfect)
            
            System.out.println(num + " is a Perfect Square.");
        else
            System.out.println(num + " is NOT a Perfect Square.");
    }
}
