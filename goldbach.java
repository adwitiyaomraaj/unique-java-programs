import java.util.*;
class goldbach{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.println("INVALID INPUT. NUMBER IS ODD.");
            System.exit(0);
        }
        if (n <= 9 || n >= 50) {
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
            System.exit(0);
        }
        System.out.println("PRIME PAIRS ARE:");
        for (int i = 3; i <= n / 2; i += 2) {
            int flag1 = 0; 
            for (int k = 2; k <= i / 2; k++) {
                if (i % k == 0) {
                    flag1 = 1;
                    break;
                }
            }
            if (flag1 == 0) {
                int j = n - i;
                int flag2 = 0; 
                for (int k = 2; k <= j / 2; k++) {
                    if (j % k == 0) {
                        flag2 = 1;
                        break;
                    }
                }
                if (flag2 == 0) {
                    System.out.println(i + ", " + j);
                }
            }
        }
    }
}