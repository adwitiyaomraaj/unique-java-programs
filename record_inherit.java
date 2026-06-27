import java.util.*;
// Base Class
class record_inherit {
    String[] name;
    int[] rnk;
    public record_inherit() {
        // The prompt specifies a size of 50 students
        name = new String[50];
        rnk = new int[50];
    }
    public void readvalues() {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<50; i++){
            System.out.print("Enter name of student " + (i+1) + ": ");
            name[i] = sc.next();
            System.out.print("Enter rank: ");
            rnk[i] = sc.nextInt();
        }
    }   
    public void display() {
        System.out.println("NAME\t\tRANK");
        for(int i=0; i<50; i++){
            System.out.println(name[i] + "\t\t" + rnk[i]);
        }
    }
}
// Derived Class
/*class Rank extends record_inherit {
    int index;
    public Rank() {
        super(); // Invokes the record_inherit constructor to allocate the arrays
        index = 0;
    }
    public void highest() {
        int minRank = rnk[0];
        index = 0;   
        // Linear search to find the mathematically lowest number (highest rank)
        for(int i=1; i<50; i++){
            if(rnk[i] < minRank){
                minRank = rnk[i];
                index = i; // Save the location of the new highest rank
            }
        }
    }
    // The prompt says "find the highest rank along with the names"
    // We add a display method here to output that specific requirement
    public void display() {
        super.display(); // First print the full list from the base class
        System.out.println("\n--- TOPMOST RANK DETAILS ---");
        System.out.println("Name: " + name[index]);
        System.out.println("Rank: " + rnk[index]);
    }
}*/