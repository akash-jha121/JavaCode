interface shape{
    void getarea(int l,int b);
}
class Rectangle implements shape{
   public void getarea(int l,int b){
    System.out.println("area of rectangle is:"+(l*b));

    }
}
class Triangle implements shape{
    public void getarea(int l,int b){
     System.out.println("area of triangle is:"+(l*b)/2);
 
     }
    }
class inter{
    public static void main(String[]args){
        shape s=new Rectangle();
        shape t=new Triangle();
        s.getarea(2,8);t.getarea(5,8);
    }
}
