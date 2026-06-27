

class array{
    
    public static void main(String[] args){
        int marks[] = {90 , 95, 75, 80, 57};
        
        System.out.println("Roll NO.\t Marks");
        System.out.println("--------\t -----");
        
        for(int i = 0; i<5; i++){
            System.out.println(i + "\t\t" + marks[i]);
        }
    }
}