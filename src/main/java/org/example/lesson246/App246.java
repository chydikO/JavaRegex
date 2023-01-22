package org.example.lesson246;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App246 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Aa-z0-9.-]+\\.[]A-Za-z]{2,4}\\b");
        Matcher m = p.matcher("my Email is my.email@ukr.net");

        while (m.find()) {
            System.out.print("m.start:\t" + m.start() + "\nm.group()\t" + m.group());
        }
    }
}
