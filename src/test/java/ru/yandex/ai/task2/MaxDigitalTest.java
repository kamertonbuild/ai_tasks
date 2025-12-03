package ru.yandex.ai.task2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Тест для {@link MaxDigital}.
 */
class MaxDigitalTest {

    MaxDigital maxDigital = new MaxDigital();

    @ParameterizedTest
    @CsvSource({
        "\"\",\"\",\"\"",
        "0, 0, 0",
        "0, 279, 9",
        "098, 100, 198",
        "2345, 1, 2345",
        "2345, 0, 2345",
        "2345, 193, 9345",
        "2345, 1583, 8545",
        "2345, 15839, 9855",
    })
    void maximizedDigitalA(String a, String b, String result) {
        assertThat(maxDigital.maximizedDigitalA(a, b))
            .isEqualTo(result);
    }
}