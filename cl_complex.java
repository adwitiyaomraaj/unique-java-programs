


import java.util.*;
class cl_complex {
    
    int a, b;
    cl_complex() {
        a = 0;
        b = 0;
    }
    
    void input() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        a = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        b = sc.nextInt();
    }
    
    void show() {
        
        System.out.println(a+"+ i"+b);
    }
    
    void add_complex(cl_complex c1, cl_complex c2) {
        a = c1.a + c2.a;
        b = c1.b + c2.b;
        System.out.print("Sum = ");
        System.out.println(a+"+ i"+b);
    }
    
    public static void main(String args[]) {
        cl_complex c1 = new cl_complex();
        cl_complex c2 = new cl_complex();
        cl_complex ob = new cl_complex();
        System.out.println("Enter first complex number:");
        c1.input();
        System.out.println("Enter second complex number:");
        c2.input();
        System.out.println("first complex number:");
        c1.show();
        System.out.println("second complex number:");
        c2.show();
        ob.add_complex(c1, c2);
    }
}
