package ru.yandex.process.task1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Отсортировать числа в массиве согласно сумме их цифр.
 * <p>
 * Для сортировки чисел используется метод Arrays.sort. Логика сравнения задается в компараторе calcSum.
 * Используем цикл, в котором целочисленно делим на 10 исходное число, таким образом получаем отдельный разряд числа.
 * Суммируем его в цикле по всем цифрам числа.
 * <p>
 * Arrays.sort реализует алгоритм Timsort. Средняя сложность алгоритма O(nlg(n)), где n - размер массива.
 * <p>
 * Определение суммы цифр в числе зависит только от кол-ва цифр в числе: [lg(m)] + 1 => O(lg(m)), где m - максимальное
 * число в массиве. Таким образом сложность определения суммы цифр чисел массива O(nlg(m)).
 * <p>
 * Итоговая сложность алгоритма: O(nlg(n) + nlg(m))
 */
public class ArraySortSum {

    public static Integer[] sortSum(Integer[] arr) {
        Arrays.sort(arr, Comparator.comparingInt(ArraySortSum::calcSum));
        return arr;
    }

    private static Integer calcSum(Integer number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }

        return result;
    }

}
