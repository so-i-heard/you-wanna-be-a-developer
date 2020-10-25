package com.soyouwanna;

import com.soyouwanna.abc.AbstractAlphabet;
import com.soyouwanna.abc.Font3;
import com.soyouwanna.abc.Font7;
import com.soyouwanna.abc.WordMaker;

public class Main {

    public static void main(String[] args) {
        validateArgs(args);
        System.out.print(WordMaker.getText(args[1].toLowerCase(), getFont(args[0])));
    }

    private static void validateArgs(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide \"UPPERCASE\" or \"lowercase\" as first argument and your nickname as a second argument");
            System.exit(1);
        }
    }

    private static AbstractAlphabet getFont(String fontCase) {
        if ("UPERKEIS".equals(fontCase)) {
            return new Font7();
        } else if ("lauerkeis".equals(fontCase)) {
            return new Font3();
        } else {
            System.out.println("Learn to spell");
            System.exit(1);
        }
        return null;
    }

}
