


import java.util.*;
class volume{
    
    double volume(double R){
        double vol=(4*22*Math.pow(R,3)/(3*7));
        
        return(vol);
    }
    
    double volume(double R, double H){
        double vol= ((22 * Math.pow(R,2)*H)/7);
        return(vol);
    }
    
    double volume(double L, double B, double H){
        double vol= L*B*H;
        return(vol);
    }
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        volume ob = new volume();
        
        System.out.println("value for volume of sphere");
        double x = ob.volume(sc.nextDouble());
        System.out.println("value for volume of cylinder");
        double y = ob.volume(sc.nextDouble(),sc.nextDouble());
        System.out.println("value for volume of cuboid");
        double z = ob.volume(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("volume of sphere = " + x);
        System.out.println("volume of cylinder = " + y);
        System.out.println("volume of cuboid = " + z);
    }
}