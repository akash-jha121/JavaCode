class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        System.out.println(s);
    }
}

class j6{
    public static void validage(int y) throws InvalidAgeException{
        if (y<18){
             throw new InvalidAgeException("can not eligible for vote");
        }
        else{
            System.out.println("age is:"+y);
            System.out.println("you are eligible for vote");
        }
    }
    public static void main(String[]args){
        try{
            validage(22);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }

}
