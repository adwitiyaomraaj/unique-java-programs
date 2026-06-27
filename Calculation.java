

class Calculation {
     
     double calc(int p, double r, int t) {
        double ci = p * Math.pow((1 + r / 100), t);
        
        return ci;
    }
     
     boolean calc(int n) {
        int sum = 0;
        
        for (int i = 1; i < n; i++) {
            
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
     
     void calc(int l, int b) {
        int area = l * b;
        
        System.out.println("Area of Rectangle: " + area);
    }
    
    public static void main(String args[]){
        Calculation ob = new Calculation();
        ob.calc(10,5,10);
        ob.calc(25);
        ob.calc(20,40);
    }
}