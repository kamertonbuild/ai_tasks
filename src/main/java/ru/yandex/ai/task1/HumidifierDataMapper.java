package ru.yandex.ai.task1;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import java.util.Arrays;
import java.util.List;

public class HumidifierDataMapper {

    public List<Tuple2<Integer, Integer>> toTuplesList(String data) {
        return Arrays.stream(data.split("\n"))
            .skip(1)
            .map(step ->
                step.trim().split("(\\D+)")
            )
            .map(tiVi -> Tuple.of(
                    Integer.valueOf(tiVi[0]),
                    Integer.valueOf(tiVi[1])
                )
            )
            .toList();
    }

}
