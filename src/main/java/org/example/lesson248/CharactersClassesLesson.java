package org.example.lesson248;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharactersClassesLesson {
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("gr[ae]y]");
        Matcher matcher1 = pattern1.matcher("gray");
        while (matcher1.find()) {
            System.out.println("matcher1.start:\t" + matcher1.start() + "\tmatcher1.group:\t" + matcher1.group());
        }

        Pattern pattern2 = Pattern.compile("gr[ae]y]");
        Matcher matcher2 = pattern2.matcher("gray");
        while (matcher2.find()) {
            System.out.println("matcher2.start:\t" + matcher2.start() + "\tmatcher2.group:\t" + matcher2.group());
        }
    }
}
