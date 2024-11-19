import java.util.*;
class m4 {    //find ascii value of entered character
    public static void main(String[]args){
        char ch;
        System.out.print("enter character:");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int a=ch;
        System.out.println("ascii value is:"+a);
                                       // all ascii value of all character
        for(int i=6;i<123;i++){
            System.out.println(i+":"+(char) i);
        }
        for(char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();

    }
    
}
