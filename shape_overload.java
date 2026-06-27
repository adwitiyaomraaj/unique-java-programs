

class shape_overload
{
    
    double area(double r){
        double pi= Math.PI;
        double ar= pi * r * r;
        
        return (ar);
    }
    
    int area(int s){
        int ar=(s*s);
        return (ar);
    }
    
    double area(double a, double b){
     double ar= a*b;
     return (ar);
    }
    
    public static void main(){
        shape_overload O= new shape_overload();
        double x= O.area(5.0);
        int y=O.area(3);
        double z= O.area(4.0,3.0);
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}