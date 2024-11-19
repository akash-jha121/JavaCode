class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("thread A:"+i);
        }
        System.out.println("exit form thread A");
    }
}
class B extends Thread{
    public void run(){
        for(int j=0;j<5;j++){
            System.out.println("thread B:"+j);
        }
        System.out.println("exit form thread B");
    }
}
class C extends Thread{
    public void run(){
        for(int k=0;k<5;k++){
            System.out.println("thread C:"+k);
        }
        System.out.println("exit form thread C");
    }
}
class th12{
    public static void main(String[]args){
        A a=new A();
        B b=new B();
        C c=new C();
        a.start();b.start();c.start();
    }
}
    

