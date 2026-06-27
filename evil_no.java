


import java.util.*;
class evil_no{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int countOnes = 0;
        int temp = num;

        
        while (temp > 0) {
            
            if ((temp & 1) == 1) {  
                countOnes++;
            }
            temp = temp >> 1;  
        }

        if (countOnes % 2 == 0)
            
            System.out.println(num + " is an Evil Number.");
        else
            System.out.println(num + " is NOT an Evil Number.");
    }
}
