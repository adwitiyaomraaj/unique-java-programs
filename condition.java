

class condition
{
    
    public static void main(String args[])
    {
        int p=25;
        char C=(p>=90)?'A':((p>=75&&p<90)?'B':((p>=60&&p<75)?'C':((p>=45&&p<60)?'D':((p>=35&&p<45)?'E':'F')))); 
        
        System.out.println(C);
    }
}
