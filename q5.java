class q5 {
    int a; double d;
   private q5(){
    a=23;                  //private things accessible with in the class only.
    d=45.678;
    }  
    void disp(){
        System.out.println(a+" "+d);
    }
    public static void main(String[]args){
        q5 obj=new q5();
        obj.disp();
    }
}

    

    

