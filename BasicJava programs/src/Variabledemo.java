
public class Variabledemo  
{  
    static int m=100;//static variable  
     static void method()  
    {    
        int n=90;//local variable 
        System.out.println("N="+n);

    }  
    public static void main(String args[])  
    {  
        int data=50;//instance variable    
        System.out.println("M="+m);
        System.out.println("data="+data);
        method();
        
    }  
}//end