class m1 {
    public int sqrt(int n){
        int i=1,r=1;
        while(r<n){
            i=i+1;
            r=i*i; 
        }
        return i;
    }
    
}
public class q9{
    public static void main(String args[]){
        m1 obj=new m1();
        System.out.println(obj.sqrt(5625));

    }
}
