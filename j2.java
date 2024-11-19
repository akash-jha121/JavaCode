class A {
    public void disp(){
        System.out.println("java james gosling");
    } 
}
class B extends A{
     public void disp(){
        System.out.println("java is oops language");
        super.disp();
     }

}
class j2{
    public static void main(String[]args){
        B b =new B();
        b.disp();
    }
}
