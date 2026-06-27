

class student{
    
    int roll_no;
    String name;
    float fee;
    student(int roll_no,String name,float fee){
        this.roll_no= roll_no;
        this.name= name;
        this.fee= fee;
    }
    
    void display(){
        
        System.out.println(roll_no+" "+name+" "+fee);
    }
    
    public static void main(){
        student S1= new student(1,"KIM",1000f);
        student S2= new student(2,"RIM",2000f);
        S1.display();
        S2.display();
    }
}