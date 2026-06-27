


import java.util.*;
public class Keith {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();  

        int temp = num;
        String s = Integer.toString(temp);
        int d = s.length();
        int[] terms = new int[100];

        
        for (int i = d - 1; i >= 0; i--) {
            terms[i] = temp % 10;
            temp /= 10;
        }

        int sum = 0;
        int n = d;
        
        while (sum < num) {
            sum = 0;
            for (int i = n - d; i < n; i++) {
                sum += terms[i];
            }
            terms[n] = sum;
            n++;
        }

        
        if (sum == num)
            
            System.out.println("Yes! It is a Keith Number.");
        else
            System.out.println("Nope! It is not a Keith Number.");
    }
}
