import java.util.*;
class q10 {
    public static void main(String[]args){
        int r,c;
        System.out.print("enter rows of first array:");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        System.out.print("enter column of first array:");
        c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("first array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }   
        System.out.print("enter rows of second array:");
        r=sc.nextInt();
        System.out.print("enter column of second array:");
        c=sc.nextInt();
        int b[][]=new int[r][c];
        System.out.println("enter elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("second array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }   
        int d[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                d[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("after addition of two arrays:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(d[i][j]+" ");
        }
        System.out.println();

    }
    int s=0;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
             if(i==j){
                s=s+d[i][j];

             }
}
}
     System.out.println("The sum of all diagonal element(trace) of matrix:"+s);
    }
}
    

