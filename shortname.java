import java.util.*;
public class shortname {
    public static void main(String[]args){
    String s;
    System.out.print("enter string:");
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    int i=s.length()-1;
    char c;
    char d;
    while(s.charAt(i)!=' '){
        i=i-1;
    }
    int j=0;
    while(j<i){
        if(j==0){
            System.out.print(s.charAt(j)+".");
        }
        else{
             c=s.charAt(j);
             d=s.charAt(j+1);
             if(c==' '&& d!=' '){
                System.out.print(d+".");
             }
        }
        j=j+1;
    }
    System.out.print(s.substring(i+1));
    System.out.println();
}
}





