import java.util.Arrays;

public class a7 {
    public static void main(String[]args){
        int a[]={1,3,4,3,5,2,6,4,7,8,6};
        for(int i=0;i<a.length;i++){
            int c=1;
            for(int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    c=c+1;

                }
            
            }
            System.out.print(a[i]+":"+c);
            System.out.println();
        

        }
        }
    }


