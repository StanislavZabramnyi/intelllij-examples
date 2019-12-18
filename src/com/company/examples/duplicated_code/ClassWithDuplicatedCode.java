package com.company.examples.duplicated_code;

public class ClassWithDuplicatedCode {

    private static int[] array = {5, 6, 2, 7, 1, 64, 47};

    public static int getMin() {
        bubbleSort();
        return array[0];
    }

    private static void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static int getMax() {
        bubbleSort();
        return array[array.length - 1];
    }
}
