package ru.yandex.ai.task1;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.yandex.ai.task1.TestData.DATA_3_RESULT;
import static ru.yandex.ai.task1.TestData.DATA_3_STR;
import static ru.yandex.ai.task1.TestData.DATA_57_RESULT;
import static ru.yandex.ai.task1.TestData.DATA_57_STR;
import static ru.yandex.ai.task1.TestData.DATA_5_RESULT;
import static ru.yandex.ai.task1.TestData.DATA_5_STR;

import org.junit.jupiter.api.Test;

/**
 * Тест для {@link HumidifierWrapper}.
 */
class HumidifierWrapperTest {

    @Test
    void calculateError() {
        // given:
        HumidifierWrapper humidifierWrapper = new HumidifierWrapper();

        // when:
        int result = humidifierWrapper.calculate("""
           4
           1  3
           3 1
           4 4  
           7
        """);

        // then:
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void calculate3() {
        // given:
        HumidifierWrapper humidifierWrapper = new HumidifierWrapper();

        // when:
        int result = humidifierWrapper.calculate(DATA_3_STR);

        // then:
        assertThat(result).isEqualTo(DATA_3_RESULT);
    }

    @Test
    void calculate5() {
        // given:
        HumidifierWrapper humidifierWrapper = new HumidifierWrapper();

        // when:
        int result = humidifierWrapper.calculate(DATA_5_STR);

        // then:
        assertThat(result).isEqualTo(DATA_5_RESULT);
    }

    @Test
    void calculate57() {
        // given:
        HumidifierWrapper humidifierWrapper = new HumidifierWrapper();

        // when:
        int result = humidifierWrapper.calculate(DATA_57_STR);

        // then:
        assertThat(result).isEqualTo(DATA_57_RESULT);
    }
}