class ThreadId extends Thread{
    public void run(){
        try{
        System.out.println("thread "+Thread.currentThread().getId()+"running");
    }
    catch(Exception e){

    }
}
}
class th1{
    public static void main(String[]args){
        for(int i=0;i<9;i++){
            ThreadId r=new ThreadId();
            r.start();
        }
    }
}
    

