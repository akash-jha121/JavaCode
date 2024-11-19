class X extends Thread{
    public void run(){
        System.out.println("start thread X...");
        for(int i=1;i<=5;i++){
           if (i==2) yield();
            System.out.println("from thread X:="+i);
        }
        System.out.println("exit threadX");
    }
}
class Y extends Thread{
    public void run(){
        System.out.println("start thread Y...");
        for(int j=1;j<=5;j++){
            System.out.println("from thread Y:="+j);
        }
        System.out.println("exit threadY");
    }
    }
    
class Z extends Thread{
    public void run(){
        System.out.println("start thread Z...");
        for(int k=1;k<=5;k++){
            System.out.println("from thread Z:="+k);
            if(k==3){
                try{
                    sleep(1000);
                }
                catch(Exception e){

                }
            }
        }
        System.out.println("Exit threadC");
    
        }
    }

class th2{
    public static void main(String[]args){
        X t1=new X();
        Y t2=new Y();
        Z t3=new Z();
        t1.start();
        t2.start();
        t3.start();
        
    }
}
    

