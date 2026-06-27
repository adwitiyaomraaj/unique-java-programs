

class fun_over{
        
        void show(String a, float b){
            
            System.out.println("int float method");
        }
        
        void show(float a, int b){
            System.out.println("float int method");
        }
        
        public static void main(String args[]){
            fun_over t = new fun_over();
            t.show(20.5f,10);
            
        }
    }
    