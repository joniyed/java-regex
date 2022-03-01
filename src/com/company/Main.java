package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {

        String line = "J12_xy";
        // patter for username check, start with char,one underscore(_), not end with underscore(_), min length 4
        String pattern = "(?=^.{4,10}$)(^[a-zA-Z]+)([a-zA-Z0-9]*_[a-zA-Z0-9]+)";

        //String line = "192.168.0.255";
        // pattern for ip address
        // String pattern = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        System.out.println(m.matches());


        // Now create matcher object.
        //  Matcher m = r.matcher(line);
        //  if (m.find( )) {
        //  System.out.println("Found value: " + m.group(0) );
        //  System.out.println("Found value: " + m.group(1) );
        //  System.out.println("Found value: " + m.group(2) );
        //   }else {
        //      System.out.println("NO MATCH");
        //   }

    }
}
