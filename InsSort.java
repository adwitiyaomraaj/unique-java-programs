import java.util.*;

class InsSort {
    int[] arr;
    int size;

    // Parameterized constructor
    public InsSort(int s) {
        size = s;
        arr = new int[size];
    }

    public void getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " elements:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }

    public void insertionSort() {
        // Standard Insertion Sort logic, modified for DESCENDING order
        for(int i=1; i<size; i++){
            int key = arr[i];
            int j = i - 1;
            
            // The '<' sign ensures larger numbers get pulled to the front
            while(j>=0 && arr[j]<key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public double find() {
        double sum = 0.0;
        int count = 0;
        
        for(int i=0; i<size; i++){
            if(arr[i]%2 != 0){ // Checking for odd numbers
                sum += arr[i];
                count++;
            }
        }
        
        if(count==0){
            return 0.0; // Prevent divide-by-zero error if no odd numbers exist
        }
        else{
            return sum/count;
        }
    }

    public void display() {
        System.out.println("Sorted Array (Descending):");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Invoking find() directly inside the print statement as requested
        System.out.println("Average of odd numbers: " + find());
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();
        
        // Object creation and method calls
        InsSort ob = new InsSort(s);
        ob.getArray();
        ob.insertionSort();
        ob.display();
    }
}