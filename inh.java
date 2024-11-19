class S {
    int roll;
    String name;
    S(int r,String s){
        roll=r;
        name=s;
        System.out.println(roll+" "+name);

    }
         //super class method is override by child class
}  

class B extends S{
    B(){
       super(12,"xt");
        System.out.println("hello");

    }     
 }  

class inh{
    public static void main(String[]args){
        B s= new B();
    
    }
}
