import java.util.*;

// Base Class (Holds the raw data)
class basePro_inherit {
    float n1;
    float n2;
    
    // Constructor to initialize the numbers
    public basePro_inherit(float a, float b) {
        n1 = a;
        n2 = b;
    }
}

// Derived Class (Holds the logic and inherits the data)
/*class dervPro_inherit extends basePro_inherit {
    float product;
    
    public dervPro_inherit(float a, float b) {
        // Pass the numbers up to the base class constructor
        super(a, b); 
    }
    
    public void prod() {
        // n1 and n2 are inherited directly from basePro
        product = n1 * n2; 
    }
    
    public void disp() {
        System.out.println("First Number: " + n1);
        System.out.println("Second Number: " + n2);
        System.out.println("Product: " + product);
    }
}*/