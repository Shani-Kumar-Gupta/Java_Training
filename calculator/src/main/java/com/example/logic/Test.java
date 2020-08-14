package com.example.logic;
// Properties Class in Java
import java.io.FileWriter;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.setProperty("name","Shani Kumar Gupta");
        p.setProperty("email","xyz@gmail.com");

        p.store(new FileWriter("info.properties"),"Properties Example");

    }
}
