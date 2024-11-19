public class a2 {
    public static void main(String[]args){
        int max=0;
        int n[]={10,2,4,5,6,7,8,34,4};
        for(int i=0;i<n.length;i++){
            if(n[i]>max){
                max=n[i];
            }
        }
        System.out.print("max:"+max);
        System.out.println();
        int min=n[0];
        for(int j=1;j<n.length;j++){
            if(n[j]<min){
                min=n[j];
            }
    }
    System.out.print("min:"+min);
    System.out.println();
}
}
