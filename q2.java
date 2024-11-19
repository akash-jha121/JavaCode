import java.util.*;
class q2 {
    public static void main(String[]args){
        int n,p,t;
        System.out.print("enter size of array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter position which you want to delete:");
        p=sc.nextInt();
        for(int j=p;j<n-1;j++){
            a[j]=a[j+1];

        }
        for(int k=0;k<n-1;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();

    }
    
}
