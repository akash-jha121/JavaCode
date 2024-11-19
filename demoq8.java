class q8 {
    int a,b;
    q8(){      //default constructor
        a=34;b=98;
        System.out.println(a+" "+b);

    }
    public void disp(){    //normal method
        a=89;b=67;
        System.out.println(a+" "+b);
    }

    {       //instance block executed before the constructor. we can not use method inside instance block
            //only variable can use.
           a=90; b=67;
           System.out.println(a+" "+b);
    }
    static{
           System.out.println("AKASH JHA");
    }
    
}
class demoq8{
    public static void main(String[]args){
        q8 obj=new q8();
        obj.disp();
    }                /* first static block executed then instance block executed then  
                        constructor executed and then normal method execute.
                         static block will execute only once.*/
        
    }

