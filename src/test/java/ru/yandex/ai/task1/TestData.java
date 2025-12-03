package ru.yandex.ai.task1;

import com.google.common.collect.ImmutableList;
import io.vavr.Tuple;
import io.vavr.Tuple2;

public class TestData {

    /**
     * Data 3.
     */
    public static final String DATA_3_STR = """
           4
           1  3
           3 1
           4 4  
           7 1
        """;

    public static final ImmutableList<Tuple2<Integer, Integer>> DATA_3 = ImmutableList.of(
        Tuple.of(1, 3),
        Tuple.of(3, 1),
        Tuple.of(4, 4),
        Tuple.of(7, 1));

    public static final int DATA_3_RESULT = 3;


    /**
     * Data 5.
     */
    public static final String DATA_5_STR = """
            3
           1  8
            10 11
           21    5
        """;

    public static final ImmutableList<Tuple2<Integer, Integer>> DATA_5 = ImmutableList.of(
        Tuple.of(1, 8),
        Tuple.of(10, 11),
        Tuple.of(21, 5)
    );

    public static final int DATA_5_RESULT = 5;

    /**
     * Data 6.
     */
    public static final String DATA_57_STR = """
           10
           2 1
           22 10
           26 17
           29 2
           45 20
           47 32
           72 12
           75 1
           81 31
           97 7
        """;

    public static final ImmutableList<Tuple2<Integer, Integer>> DATA_57 = ImmutableList.of(
        Tuple.of(2, 1),
        Tuple.of(22, 10),
        Tuple.of(26, 17),
        Tuple.of(29, 2),
        Tuple.of(45, 20),
        Tuple.of(47, 32),
        Tuple.of(72, 12),
        Tuple.of(75, 1),
        Tuple.of(81, 31),
        Tuple.of(97, 7)
    );

    public static final int DATA_57_RESULT = 57;
}
