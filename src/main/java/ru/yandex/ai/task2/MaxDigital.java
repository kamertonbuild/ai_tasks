package ru.yandex.ai.task2;

import java.util.Arrays;

/**
 * Задача 2.
 * Даны два строковых представления чисел A и B. Нужно максимизировать A, заменив в нём любую
 * цифру на цифру из B. Каждую цифру B можно использовать только один раз.
 */
public class MaxDigital {

    public String maximizedDigitalA(String a, String b) {
        char[] bArray = b.toCharArray();
        Arrays.sort(bArray);

        int aLength = a.length();
        StringBuilder result = new StringBuilder();
        int ai;
        int bi;

        for (ai = 0, bi = bArray.length - 1; ai < aLength && bi >= 0; ai++, bi--) {
            result.append((a.charAt(ai) > bArray[bi]) ? a.charAt(ai) : bArray[bi]);
        }

        if (aLength > bArray.length) {
            result.append(a.substring(ai));
        }

        return result.toString();
    }
}
