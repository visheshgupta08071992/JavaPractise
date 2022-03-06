package PropertyFileReadingCode;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

public class ReadUsingOwnerLibrary {

    /*
    * Reading using owner libray has an advantage that all the keys gets stored
    * with respective data type, Also dont need to ensure about exception handling
    *
    * Steps to read using owner library
    *
    * 1. Create an interface which extends Config Interface from Owner library
    * 2. The interface should have path of the config file which needs to be read and all the keys
    * with respective datatype(Check OwnerInterface Created).
    * 3. With the help of ConfigFactory class you can create the instance of owner interface
    * and the get the value of respective keys
    *
    * https://www.youtube.com/watch?v=VpsnP9-jMNc&list=PL9ok7C7Yn9A_JtAB1-ZmrO7ugRq0rP83q&index=1
    * */



    @Test
    public void readUsingOnwerLibrary(){
        OwnerInterface con=ConfigFactory.create(OwnerInterface.class);
        System.out.println(con.user());
        System.out.println(con.age());
        System.out.println(con.expertise());
        System.out.println(con.married());
    }
}
