package com.company.examples;

public class SemanticHighlighting {

    private String strungMetamorphoses(String invisibleValue, String secondInvisibleValue) {

        char[] chars = invisibleValue.toCharArray();
        for (char s : chars) {
            invisibleValue = invisibleValue.replace(s, 'a');
        }

        char[] secondChars = secondInvisibleValue.toCharArray();
        for (char s : secondChars) {
            secondInvisibleValue = secondInvisibleValue.replace(s, 'a');
        }

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder changedString = stringBuilder.append(invisibleValue);

        StringBuilder secondBuilder = new StringBuilder();
        StringBuilder changedSecondString = secondBuilder.append(secondInvisibleValue);

        String newString = changedString + invisibleValue + secondInvisibleValue;
        Character firstCharOfNewString = newString.charAt(0);

        return firstCharOfNewString + invisibleValue + secondInvisibleValue + changedSecondString;
    }
}
