package ss17;

import ss17.Exception.CheckedException;

public class Main  {
    public static void main(String[] args)throws Exception {
        printName("quang");
    }

    public static void printName(String name) throws Exception{
       if(name.isBlank()){
           throw new CheckedException();
       }
        System.out.println("Main.printName");
    }

}
