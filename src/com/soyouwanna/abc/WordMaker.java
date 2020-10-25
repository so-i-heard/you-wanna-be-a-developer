package com.soyouwanna.abc;

import java.util.Arrays;

public class WordMaker {

    public WordMaker() {
    }

    public static String getText(String text, AbstractAlphabet font) {
        String result = "";
        String[] letters;

        if (text.length() == 1)
            letters = font.getAsciiFormOfLetter(text.charAt(0));
        else
            letters = concatLetters(text, font);

        for (String line : letters)
            result += line + "\n";

        return result;
    }

    private static String[] concatLetters(String text, AbstractAlphabet font) {
        String[] result = new String[font.base];
        Arrays.fill(result, "");

        char[] inputLetters = text.toCharArray();
        String[][] letterOfAsciiLetters = new String[text.length()][font.base];

        for (int i = 0; i < text.length(); i++) {
            letterOfAsciiLetters[i] = font.getAsciiFormOfLetter(inputLetters[i]);

            for (int j = 0; j < font.base; j++) {
                result[j] += " " + letterOfAsciiLetters[i][j];
            }
        }

        return result;
    }

}
