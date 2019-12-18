package com.company.examples;

public class SwitchExpressions {

    private void returnNumberName(int number) {
        String numberName = switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            default -> "I don`t know";
        };
    }

}
