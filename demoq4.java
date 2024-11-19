class q4 {    //copy constructor: when we pass object reference as a parameter to constructor.
    int a; String s;double d;                               
    q4(){
        a=34;
        s="akash";
        d=12.903;
        System.out.println(a+" "+s+" "+d);
    }
    q4(q4 r){
        a=r.a;
        s=r.s;
        d=r.d;
        System.out.println("copy:"+a+" "+s+" "+d);

    }
}

class demoq4{
    public static void main(String[]args){
        q4 r=new q4();
        q4 r1=new q4(r);
        
    }
}
