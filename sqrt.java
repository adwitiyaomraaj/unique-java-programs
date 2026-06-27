


import java.util.Scanner;
class sqrt {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;
        int result = 0;

        
        while (i * i <= num) {
            result = i;
            i++;
        }

        
        System.out.println("Square root of " + num + " is " + result);
    }
}
