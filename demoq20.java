class demoq20 {
    int a=89;static int d=67;
    {
        System.out.println("INSTANCE BLOCK: akash jha");
        System.out.println(a+" "+d);
    }
    static{
        System.out.println("STATIC BLOCK: Akash Jha ");
        System.out.println(d);
    }
    public static void main(String[]args){
       demoq20 obj=new demoq20();
        
// instance block can never execute without object. it access both static and normal variable.
    //static block execute without object.it access only static variable.
}     
    }

