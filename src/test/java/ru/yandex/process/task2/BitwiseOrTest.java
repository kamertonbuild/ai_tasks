package ru.yandex.process.task2;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BitwiseOrTest {

    @Test
    void isBitwiseOr1() {
        // given:
        int[] array = new int[] {1, 2};

        // when:
        boolean bitwiseOrEven = BitwiseOr.isBitwiseOrEven(array);

        // then:
        assertThat(bitwiseOrEven).isEqualTo((1 | 2) % 2 == 0);
    }

    @Test
    void isBitwiseOr2() {
        // given:
        int[] array = new int[] {0};

        // when:
        boolean bitwiseOrEven = BitwiseOr.isBitwiseOrEven(array);

        // then:
        assertThat(bitwiseOrEven).isEqualTo(0 % 2 == 0);
    }

    @Test
    void isBitwiseOr3() {
        // given:
        int[] array = new int[] {123, 523, 53234};

        // when:
        boolean bitwiseOrEven = BitwiseOr.isBitwiseOrEven(array);

        // then:
        assertThat(bitwiseOrEven).isEqualTo((123 | 523 | 53234) % 2 == 0);
    }
}