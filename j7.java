class X extends Thread{
    public void run(){
        System.out.println("Thread X Started");
        for(int i=1;i<4;i++){
            System.out.println("From threadX:"+" "+i);
            if (i==2){
                try{
                  Thread.sleep(1000);  
                }
                catch(Exception e){}
            }
        }
        System.out.println("exit from Thread X"); 
    }
}
class Y extends Thread{
    public void run(){
        System.out.println("Thread Y Started");
        for(int i=1;i<4;i++){
            System.out.println("From threadY:"+" "+i);
            }
            System.out.println("exit form thread Y");
        } 
    }
    class Z extends Thread{
        public void run(){
            System.out.println("Thread Z Started");
            for(int i=1;i<4;i++){
                System.out.println("From threadZ:"+" "+i);
                }
                System.out.println("exit form thread Z");
            } 
        }
class j7{
    public static void main(String[]args){
        X x=new X();
        Y y =new Y();
        Z z= new Z();
        x.start(); y.start(); z.start();
    }
}        
