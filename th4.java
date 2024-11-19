class counter
{
    int count=0;
    public void increment(){
        count++;
    }
}
class th4
{
public static void main(String[]args) throws Exception
{
counter c=new counter();
Thread t1=new Thread(new Runnable() 
  {
            public void run(){
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }
            
        });
t1.start();
t1.join();
System.out.println("count="+c.count);
    }

}
    

