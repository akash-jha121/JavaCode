import java.util.*;
class q7 {
    int r;
    public int cal_hcf(int a, int b){
        r=a%b;
        if (r!=0){
            return cal_hcf( b, r);
        }
        else{
            return b;
        }
    } 
}
class demoq7{
    public static void main(String[]args){
        int a;int b;
        System.out.print("enter a=");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int t1=a;
        System.out.print("enter b=");
        b=sc.nextInt();
        int t2=b;
        q7 obj=new q7();
       b= obj.cal_hcf(a,b);
       System.out.println("hcf is:"+b);
       int c=(t1*t2)/b;
       System.out.println("lcm is:"+c);
    }
}
