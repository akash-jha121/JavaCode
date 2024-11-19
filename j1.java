class A{
    int roll;String name;
     static int c;
    A(String s, int r){
       roll=r;
        name=s;
    }
    void disp(){
        System.out.println("name:"+name);
        System.out.println("roll:"+roll);

    }
}
class j1{
    public static void main(String[]args){
        A obj=new A("ak",12);
       A. c=1;
        A obj1=new A("bk",45);
        A.c++;
        A obj2=new A("alk",55);
        A.c++;
        A obj3=new A("sop",515);
        A.c++;
        obj.disp();obj1.disp();obj2.disp();obj3.disp();
        System.out.println("no.of objects:"+A.c);
    }
}
