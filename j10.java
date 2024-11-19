import java.io.*;
class j10 {
    public static void main(String[]a) throws IOException{
        BufferedReader br=new BufferedReader( new FileReader("/home/akash/javalearn/t1.txt"));
        String s="";
        while((s=br.readLine())!=null){
            System.out.println(s);
        }
    }
    
}
