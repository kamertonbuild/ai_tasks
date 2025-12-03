package ru.yandex.ai.task1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static ru.yandex.ai.task1.TestData.DATA_3;
import static ru.yandex.ai.task1.TestData.DATA_3_RESULT;
import static ru.yandex.ai.task1.TestData.DATA_5;
import static ru.yandex.ai.task1.TestData.DATA_57;
import static ru.yandex.ai.task1.TestData.DATA_57_RESULT;
import static ru.yandex.ai.task1.TestData.DATA_5_RESULT;

import com.google.common.collect.ImmutableList;
import io.vavr.Tuple2;
import org.junit.jupiter.api.Test;

/**
 * Тест для {@link Humidifier}.
 */
class HumidifierTest {

    @Test
    void addWater_3() {
        // when:
        int result = getResult(DATA_3);

        // then:
        assertThat(result).isEqualTo(DATA_3_RESULT);
    }

    @Test
    void addWater_5() {
        // when:
        int result = getResult(DATA_5);

        // then:
        assertThat(result).isEqualTo(DATA_5_RESULT);

    }

    @Test
    void addWater_57() {
        // when:
        int result = getResult(DATA_57);

        // then:
        assertThat(result).isEqualTo(DATA_57_RESULT);
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