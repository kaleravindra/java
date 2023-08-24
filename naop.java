
package com.company;

import java.util.Locale;

public class naop {


    public static void main(String[] args) {
        String name = "ravindra";
        int a = name.length();
        System.out.println(a);

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2,7));
        System.out.println(name.replace('i','h'));
        System.out.println(name.startsWith("ra"));
        System.out.println(name.endsWith("po"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("dr",7));
        System.out.println(name.lastIndexOf("vin",6));
        System.out.println(name.equalsIgnoreCase("rAVindra"));


    }
}

