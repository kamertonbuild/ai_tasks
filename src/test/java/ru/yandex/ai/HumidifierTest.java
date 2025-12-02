package ru.yandex.ai;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import com.google.common.collect.ImmutableList;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import org.junit.jupiter.api.Test;

/**
 * Тест для {@link Humidifier}.
 */
class HumidifierTest {

    @Test
    void createHumidifier() {
        assertDoesNotThrow(Humidifier::new);
    }

    @Test
    void addWater_3() {
        // given:
        ImmutableList<Tuple2<Integer, Integer>> data = ImmutableList.of(
            Tuple.of(1, 3),
            Tuple.of(3, 1),
            Tuple.of(4, 4),
            Tuple.of(7, 1));

        // when:
        int result = getResult(data);

        // then:
        assertThat(result).isEqualTo(3);

    }

    @Test
    void addWater_5() {
        // given:
        ImmutableList<Tuple2<Integer, Integer>> data = ImmutableList.of(
            Tuple.of(1, 8),
            Tuple.of(10, 11),
            Tuple.of(21, 5)
        );

        // when:
        int result = getResult(data);

        // then:
        assertThat(result).isEqualTo(5);

    }

    @Test
    void addWater_57() {
        // given:
        ImmutableList<Tuple2<Integer, Integer>> data = ImmutableList.of(
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

        // when:
        int result = getResult(data);

        // then:
        assertThat(result).isEqualTo(57);

    }

    private int getResult(ImmutableList<Tuple2<Integer, Integer>> data) {
        final Humidifier humidifier = new Humidifier();
        int result = 0;
        for (int i = 0; i < data.size(); i++) {
            Tuple2<Integer, Integer> tuple2 = data.get(i);
            result = humidifier.addWater(tuple2._1, tuple2._2);
        }

        return result;
    }

}