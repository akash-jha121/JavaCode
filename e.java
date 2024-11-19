class e{
    public static void main(String[]args){
        int a=10; int b=2;int c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("number cannot divide by Zero");
        }
        int b1[]={1,2,3,5};
        try{
            System.out.println(b1[2]);

        }
        catch(Exception e){
            System.out.println("index is out of range");
            System.out.println(e);
        }
        String s="aw";
        try{
            int a1=Integer.parseInt(s);
            System.out.println(a1);
        }
        catch(Exception e){
            System.out.println("string cannot be converted into int");
            System.out.println(e);
        }
        System.out.println("program executed succesfully...");
    }
}
