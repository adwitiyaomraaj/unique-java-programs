

class Student_this{
    
    int roll_no;
    String name;
    float fee;
    Student_this(int roll_no, String name, float fee)
    {
        this.roll_no= roll_no;
        this.name= name;
        this.fee= fee;
    }
    
    void display()
    {
        
        System.out.println(roll_no+" "+name+" "+fee);
    }
    
    public static void main(String args[])
    {
            Student_this S1= new Student_this(1,"KIM",1000f);
            Student_this S2= new Student_this(2,"REP",2000f);
            S1.display();
            S2.display();
    }
}
    
