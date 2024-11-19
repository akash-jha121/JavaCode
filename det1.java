import java.util.*;
class det1 {
    public static void main(String[]args){   //calculate determinant of matrix
        int x,y,z,d;
        System.out.println("enter element:");
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
              System.out.print(a[i][j]+" ");
        
 }
           System.out.println();
    }
    x=(a[1][1]*a[2][2]-a[2][1]*a[1][2]);
    y=(a[1][0]*a[2][2]-a[1][2]*a[2][0]);
    z=(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
    d=a[0][0]*x-a[0][1]*y+a[0][2]*z;
    System.out.println("determinant is:"+d);


}  
}
