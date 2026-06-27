import java.util.*;

class batchagaloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (x): ");
        int x = sc.nextInt();
        
        // Step 1: Convert x to Base 8 string
        int temp = x;
        String p = "";
        if (temp == 0) {
            p = "0";
        } else {
            while (temp != 0) {
                int rem = temp % 8;
                p = rem + p;
                temp = temp / 8;
            }
        }
        
        int len = p.length();
        
        // Step 2: Loop up to 5 times for the sort-subtract sequence
        for (int step = 1; step <= 5; step++) {
            
            // Sort digits of 'p' in increasing order to create 'q'
            char[] arr = p.toCharArray();
            for (int i = 0; i < len - 1; i++) {
                for (int j = 0; j < len - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        char t = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = t;
                    }
                }
            }
            
            String q = "";
            for (int i = 0; i < len; i++) {
                q += arr[i];
            }
            
            // Convert p and q to decimal to perform TRUE Base 8 subtraction safely
            int decP = 0, decQ = 0, power = 0;
            for (int i = len - 1; i >= 0; i--) {
                decP += (p.charAt(i) - 48) * (int) Math.pow(8, power);
                decQ += (q.charAt(i) - 48) * (int) Math.pow(8, power);
                power++;
            }
            
            int diffDec = decP - decQ;
            
            // Convert the difference back to a Base 8 string
            String nextP = "";
            int tempDiff = diffDec;
            if (tempDiff == 0) {
                nextP = "0";
            } else {
                while (tempDiff != 0) {
                    int rem = tempDiff % 8;
                    nextP = rem + nextP;
                    tempDiff = tempDiff / 8;
                }
            }
            
            // Pad the new string with leading zeros to maintain original digit length
            while (nextP.length() < len) {
                nextP = "0" + nextP;
            }
            
            p = nextP;
            
            // Break early if the result digits are already sorted in ascending order
            int flag = 0;
            for (int i = 0; i < len - 1; i++) {
                if (p.charAt(i) > p.charAt(i + 1)) {
                    flag = 1; // 1 means not sorted yet
                    break;
                }
            }
            
            if (flag == 0) {
                break;
            }
        }
        
        // Step 3: Convert the final 'p' back to Base 10
        int finalDec = 0;
        int power = 0;
        for (int i = len - 1; i >= 0; i--) {
            finalDec += (p.charAt(i) - 48) * (int) Math.pow(8, power);
            power++;
        }
        
        System.out.println("Batchagaloop value: " + finalDec);
    }
}