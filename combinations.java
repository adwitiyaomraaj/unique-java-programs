import java.util.*;

class combinations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N=");
        int n = sc.nextInt();
        
        // Step 1: Validate the input bounds
        if (n < 2 || n > 20) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        
        System.out.println("Output : Given number " + n);
        System.out.println("Combinations :");
        
        // We use a String array to collect the combinations so we can sort them later
        String[] res = new String[1000]; 
        int count = 0;
        
        // We use an integer array to slide numbers around and generate the partitions
        int[] p = new int[n];
        int k = 0;
        p[k] = n;
        
        // Step 2: Generate all the mathematical combinations
        while (true) {
            // We don't want to print 'N' itself, so we skip when k == 0 (which means the array is just [N])
            if (k != 0) {
                String temp = "";
                // Build the string from right to left to help it look ascending
                for (int i = k; i >= 0; i--) {
                    temp += p[i] + " ";
                }
                res[count] = temp;
                count++;
            }
            
            // The Sliding Logic: Break numbers down into 1s
            int rem = 0;
            while (k >= 0 && p[k] == 1) {
                rem += p[k];
                k--;
            }
            
            // If we run out of numbers to break down, the loop is finished
            if (k < 0) {
                break;
            }
            
            p[k]--;
            rem++;
            
            // Redistribute the remainder to form the next combination
            while (rem > p[k]) {
                p[k + 1] = p[k];
                rem -= p[k];
                k++;
            }
            p[k + 1] = rem;
            k++;
        }
        
        // Step 3: Bubble Sort the strings so they print in perfect order
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (res[j].compareTo(res[j + 1]) > 0) {
                    String swap = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = swap;
                }
            }
        }
        
        // Step 4: Print the final sorted list
        for (int i = 0; i < count; i++) {
            System.out.println(res[i].trim());
        }
    }
}