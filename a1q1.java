import java .util.Scanner;
public class a1q1 {
    public static int sum_digit(int n){
        int r,s=0;
        while(n>0){
            r=n%10;
            s=s+r;
            n=n/10;    
        }
        return s;

    }
    public static void main(String[]args){
        int n;
        System.out.print("enter number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(sum_digit(n));
    }
    }


    

