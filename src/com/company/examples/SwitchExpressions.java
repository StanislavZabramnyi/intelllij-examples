package com.company.examples;

public class SwitchExpressions {

    private void returnNumberName(int number) {
        String numberName;
        switch (number) {
            case 1:
                numberName = "one";
                break;
            case 2:
                numberName = "two";
                break;
            case 3:
                numberName = "three";
                break;
            case 4:
                numberName = "four";
                break;
            case 5:
                numberName = "five";
                break;
            default:
                numberName = "I don`t know";
                break;
        }
    }

}
