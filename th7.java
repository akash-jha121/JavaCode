class A extends Thread{
    public void run(){
                System.out.println("threadA is running"); 
                
    }
    
     
}

class B extends Thread{
    public void run(){
        try{
            sleep(2000);
            String s=Thread.currentThread().getName();
            System.out.println(s);
        }
        catch(Exception e){

        }

    }
    }


class th7{
    public static void main(String[]args){
        A t1=new A();
        B t2=new B();
        t1.start();
        t2.setName("changed Thread name: ThreadA2");
        t2.start();
    }
}
    

