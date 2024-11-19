class Customer{
    int a=10000;
    synchronized void withdraw(int a){
        System.out.println("going to withdraw..");
        if(this.a<a){
            System.out.println("less balance;waiting for deposit");
            try{wait();}catch(Exception e){}
        }
        this.a=this.a-a;
        System.out.println("withdraw complete..");
    }
    synchronized void deposit(int a){
        System.out.println("going to deposit..");
        this.a=this.a+a;
        System.out.println("deposit complete..");
        notify();
    }
}
class th8{
    public static void main(String[]args){
        final Customer c=new Customer();
        new Thread(){
            public void run(){c.withdraw(15000);}
        }.start();
        new Thread(){
            public void run(){c.deposit(10000);}
        }.start();

        }
    }

    

