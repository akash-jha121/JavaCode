class c2 {   //method overloading
    public void add(int a,int b){
        System.out.println((a+b));
    }
    public void add(int a,int b,int c){
        System.out.println((a+b+c));
    }    
    public void add(double a ,double b){
        System.out.println((a+b));
    }    
    
}
class democ2{
    public static void main(String[]args){
     c2 obj=new c2();
     obj.add(5,6);
     obj.add(4,9,8);
     obj.add(4.9,5.7);

}
}
