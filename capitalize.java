
import java.util.*;
class capitalize {
    public static void main(String[] args) {
        String s;
        System.out.print("enter string:");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        String s1="";
        char ch;
        int a;
        String[]w=s.split(" ");
        for(int i=0;i<w.length;i++){
            for (int j=0;j<w[i].length();j++){
                if(j==0 || j==w[i].length()-1){
                  ch=w[i].charAt(j);
                   a=ch-32;
                  s1=s1+(char)a;
            }
            else{
                ch=w[i].charAt(j);
                s1=s1+ch;
            }
            
        }
        s1=s1+" "; 
        
}
System.out.println(s1);
}
}
    

