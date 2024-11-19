import java.util.*;
class j3 {
    public static void main(String[] args) {
        int a;
        int b;
        String s;
        System.out.print("enter a:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.print("enter b:");
        b=sc.nextInt();
        try{
            System.out.println((a/b));
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.print("enter string:");
        s=sc.next();
        try{
            int c=Integer.parseInt(s);
            System.out.println(c); 
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("string cannot be converted into int");
        }
        
        
    }
}
