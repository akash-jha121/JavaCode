import java.util.*;
public class a1q7 {
    public static void main(String[]args){
        int n;
        System.out.print("enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
