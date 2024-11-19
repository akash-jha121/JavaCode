import java.util.*;
public class revwords {
    public static void main(String[]args){
    String s;
    String s1="";
    int r;
    System.out.print("enter string:");
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    String[]w=s.split(" ");
    for(int i=w.length-1;i>=0;i--){
        s1=s1+w[i]+" ";
    }
    System.out.println(s1);
    } 
}

