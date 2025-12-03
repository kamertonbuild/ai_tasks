package ru.yandex.ai.task1;

public class Humidifier {

    private static final int CAPACITY_OF_WATER_SPILLED = 1;

    private int capacity = 0;
    private int previousTi = 0;

    public int addWater(int ti, int vi) {
        capacity -= (ti - previousTi) * CAPACITY_OF_WATER_SPILLED;

        if (capacity < 0) {
            capacity = 0;
        }

        capacity += vi;
        previousTi = ti;

        return capacity;
    }
}
