class circle_inherit extends shape_inherit{
    circle_inherit(){
        super();
    }
    
    void getPerimeter(){
        double p=2*3.14*a;
        System.out.println("Perimeter of Circle is: "+p);
    }
    void getArea(){
        double ar=3.14*a*a;
        System.out.println("Area of Circle is: "+ar);
    }
    public static void main(String[] args) {
        circle_inherit ob = new circle_inherit();
        ob.getPerimeter();
        ob.getArea();
    }
}
