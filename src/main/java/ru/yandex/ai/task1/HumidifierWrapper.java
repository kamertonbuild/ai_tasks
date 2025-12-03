package ru.yandex.ai.task1;

import io.vavr.Tuple2;
import java.util.List;

/**
 * Задача 1.
 * <p>
 * Напишите функцию для решения следующей задачи:
 * <p>
 * В офисе AtCoder есть один увлажнитель. В момент времени 0 в нем нет воды.
 * Вы доливаете воду N раз. В i-й раз (1 ≤ i ≤ N) вы доливаете V_i литров в момент T_i.
 * Гарантируется, что T_i < T_{i+1} для всех 1 ≤ i ≤ N−1.
 * Увлажнитель протекает: пока в нем есть вода, её количество уменьшается со скоростью 1 литр за единицу времени.
 * Требуется найти количество воды в увлажнителе сразу после того, как вы закончите долив в момент T_N.
 * <p>
 * Данные подаются как многострочная строка (input_str):
 * <p>
 * Первая строка: одно целое число N — количество доливов.
 * Следующие N строк: по два целых числа T_i и V_i, разделённые пробелом.
 * Гарантируется, что T_i строго возрастают.
 * Функция должна вернуть строку с одним числом — количеством воды сразу после долива в момент T_N.
 */
public class HumidifierWrapper {

    public int calculate(String inputStr) {
        if (inputStr == null || inputStr.isEmpty()) {
            System.err.println("Enter the line with the humidifier filling parameters!");
            return -1;
        }

        final HumidifierDataMapper mapper = new HumidifierDataMapper();
        List<Tuple2<Integer, Integer>> tuplesList;
        try {
            tuplesList = mapper.toTuplesList(inputStr);
        } catch (Exception e) {
            System.err.printf("Error parsing string: %s", inputStr);
            return -1;
        }

        Humidifier humidifier = new Humidifier();
        int result = 0;
        for (Tuple2<Integer, Integer> tuple2 : tuplesList) {
            result = humidifier.addWater(tuple2._1, tuple2._2);
        }

        System.out.println(result);
        return result;
    }
}
