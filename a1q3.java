import java.util.Scanner;
public class a1q3 {
    public static void main(String[]args){
    String s,st="";
    System.out.print("enter name:");
    Scanner sc=new Scanner(System.in);
    s=sc.next();
    for(int i=s.length()-1;i>=0;i--){
        st=st+s.charAt(i);
    }
    
    if(st.equals(s))
    {
        System.out.println("palindrome string");

    }
    else{
        System.out.println("not palindrome string");

    }
    
    
    
    }
}
