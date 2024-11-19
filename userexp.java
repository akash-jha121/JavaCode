class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String s){
        System.out.println(s);
    }
}
class userexp{
    public static void chk_bal(int m,int w) throws InsufficientBalanceException {
        int r=m-w;
        if(r<=2000){
            throw new InsufficientBalanceException("insufficient balance...you can not withdrawl");
        }
        else{
            System.out.println("current balance was:"+m);
            System.out.println("amount debited:"+w);
            System.out.println("rest amount:"+r);
        }
    }
    public static void main(String[]args){
    try{
        chk_bal(11000,5000);
    }
    catch(Exception e){
        System.out.println(e);
    }
    System.out.println("thank you sir and visit again");

}
}
