class c1 {   //constructor overloading
    int a,b;
    String s;
    c1(){
        a=100;
        b=230;
    }
    c1(String x){
        s=x;
        
    }
    c1(int c,String d ){
        a=c;
        s=d;

    }
}
class democ1{
    public static void main(String[]args){
        c1 obj=new c1();
        c1 obj1=new c1("akash");
        c1 obj2=new c1(34,"shiva");
        System.out.println(obj.a+" "+obj.b);
        System.out.println(obj1.s);
        System.out.println(obj2.a+" "+obj2.s);
        

        
        

    }
}