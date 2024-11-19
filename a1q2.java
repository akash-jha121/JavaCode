import java .util.Scanner;
public class a1q2 {
    public static void main(String[]args){
        int n,z,s=0;
        int x=0;
        int y=1;
        System.out.print("enter terms:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(x);
        System.out.println(y);
        for(int i=3;i<=n;i++){
            z=x+y;
            x=y;
            y=z;
            s=s+z;
            
        
        System.out.println(z);
        }
        System.out.print("sum is:"+s+1);



    }
    
}
