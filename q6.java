import java.util.*;
class q6 {
    public static void main(String[]args){
        int n;
        System.out.print("enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print((2*j+1)+" ");
            }
            System.out.println();
        }
    }
    
}
