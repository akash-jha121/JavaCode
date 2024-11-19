import java.io.*;
class j9{
  public static void main(String[]a) throws IOException{
     BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("/home/akash/javalearn/t1.txt"));
     String s="this is file handling java program \n this is second line";
                
                        
     bos.write(s.getBytes());
     bos.close();
     System.out.println("data written succesfully");
  }
}
