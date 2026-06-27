class EmpSal_inherit {
    String empname;
    int empcode;
    double salary;
    
    public EmpSal_inherit(String n, int c, double s) {
        empname = n;
        empcode = c;
        salary = s;
    }
    
    public void show() {
        System.out.println("Employee Name: " + empname);
        System.out.println("Employee Code: " + empcode);
        System.out.println("Basic Salary: " + salary);
    }
}
// (ONLY WRITE THIS CLASS IN THE BOARD EXAM)
/*class Overtime_inherit extends EmpSal_inherit {
    int hours;
    double ts;
    
    public Overtime_inherit(String n, int c, double s, int h) {
        // Step1 1: Pass the base details up to the parent constructor
        super(n, c, s); 
        hours = h;
    }
    
    public void calSal() {
        double overtimeAmt = 0; // Default is 0 for < 30 hours
        
        // Step 2: Apply the overtime logic rules
        if(hours>40){
            overtimeAmt = 5000;
        }
        else if(hours>=30 && hours<=40){
            overtimeAmt = 3000;
        }
        
        // 'salary' is inherited directly from EmpSal
        ts = salary + overtimeAmt; 
    }
    
    public void show() {
        // Step 3: Trigger the parent class print statements first
        super.show(); 
        System.out.println("Hours Worked: " + hours);
        System.out.println("Total Salary: " + ts);
    }
}
    */