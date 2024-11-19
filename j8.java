import java.io.*;
class j8{
    public static void main(String[]a) throws IOException{
        BufferedInputStream bis= new BufferedInputStream(new FileInputStream("/home/akash/javalearn/m4.java"));
        int i;
        while((i=bis.read())!=-1){
            System.out.print((char) i);
        }
        bis.close();
    }
}

    
