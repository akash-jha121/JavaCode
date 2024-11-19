class A {
    private int x=7;
    protected int y=8;
    public int z=78;
    public void show1(){
        System.out.println("x,y,z:"+x+" "+y+" "+z);
    }
}
class B extends A{
    int w=23;
    private double d=98.6;
    public void show2(){
        System.out.println("x,y,z,w,d:" +y+" "+z+" "+w+" "+d);
    }
    public void show3(){
        System.out.println("y,z,w,d:"+" "+y+" "+z+" "+w+" "+d);
    }
}
class C extends B{
    int p=718;
    public void show4(){
        System.out.println("x,y,z,w,d,p:"+y+" "+z+" "+w+" "+" "+p);
    }
    public void show5(){
        System.out.println("y,z,w:"+y+" "+z+" "+w);
    }
}
class D{
    public static void main(String[]args){
        C obj=new C();
        obj.show1();
       /* 
       
        obj.show2();
        obj.show3();
        obj.show4();
        obj.show5();*/

    }
}
      
