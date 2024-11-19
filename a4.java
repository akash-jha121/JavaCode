public class a4 {
    public static void main(String[]args){
        int a[][]={{1,10,3,8},
                    {9,12,6,7},
                    {5,2,11,4}
    };
    for(int i=0;i<3;i++){
       int max=0;
        for(int j=0;j<4;j++){
            if(a[i][j]>max){
                max=a[i][j];
            }

            }

        
        System.out.print("max is:"+max);
        System.out.println();

    }
    for(int i=0;i<3;i++){
        int min=a[i][0];
         for(int j=0;j<4;j++){
             if(a[i][j]<min){
                 min=a[i][j];
             }
 
             }
             System.out.print("min is:"+min);
             System.out.println();
    
}
}
}

