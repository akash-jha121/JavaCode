import java.util.*;
class q1 {
    public static void main(String[]args){
        int n,p,e;
        System.out.print("enter size of array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n+1];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter position:");
        p=sc.nextInt();
        System.out.print("enter element:");
        e=sc.nextInt();
        for(int j=n;j>p;j--){
            a[j]=a[j-1];
        }
        a[p]=e;
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
    }  
}
    