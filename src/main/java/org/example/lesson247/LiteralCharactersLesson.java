package org.example.lesson247;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LiteralCharactersLesson {
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("a");
        Matcher matcher1 = pattern1.matcher("Jack is a boy");
        while (matcher1.find()) {
            System.out.println("matcher1.start:\t" + matcher1.start() + "\nmatcher1.group:\t" + matcher1.group());
            System.out.println("-".repeat(20));
        }

        Pattern pattern2 = Pattern.compile("cat");
        Matcher matcher2 = pattern2.matcher("About cats and dogs");
        while (matcher2.find()) {
            System.out.println("matcher2.start:\t" + matcher2.start() + "\nmatcher2.group:\t" + matcher2.group());
            System.out.println("-".repeat(20));
        }
    }
}
