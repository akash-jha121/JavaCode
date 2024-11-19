import java.util.*;
class A {  
    int n;            // hierarichical inheritance
    void input(){
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    
}
class B extends A{
    void disp(){
          if(n>0){
          System.out.println("positive number");
}
}
}
class C extends A{
    void show(){
        if(n<0){
            System.out.println("negative number");
  }

    }
}
class D extends A{
    void show1(){
        System.out.println("niether +ve nor -ve");
    }
}
class hier{
    public static void main(String[]args){
        B r1=new B();
        r1.input(); r1.disp();
        C r2=new C();
        r2.input(); r2.show();
        D r3=new D();
        r3.input(); r3.show1();
    
    }
}
