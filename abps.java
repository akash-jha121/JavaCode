abstract class comedymovie{
       abstract void bestmovie();
}
class welcome extends comedymovie{
      void bestmovie(){
        System.out.println("welcome is good movie");
      }
}
class herapheri extends comedymovie{
    void bestmovie(){
        System.out.println("herapheri is better than welcome");
    }
}
class KhattaMeetha extends comedymovie{
    void bestmovie(){
        System.out.println("KhattaMeetha is best movie");
    }
}
class abps{
    public static void main(String[]args){
        welcome w= new welcome();
        w.bestmovie();
        herapheri hp=new herapheri();
        hp.bestmovie();
        KhattaMeetha km= new KhattaMeetha();
        km.bestmovie();
        System.out.println("we can not create object for abstract class");
    }
}
