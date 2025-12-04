package ru.yandex.process.task1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ArraySortSumTest {

    @Test
    void sortSum1() {
        // when:
        Integer[] result = ArraySortSum.sortSum(new Integer[] {});

        // then:
        assertThat(result).isEqualTo(new Integer[] {});
    }

    @Test
    void sortSum2() {
        // when:
        Integer[] result = ArraySortSum.sortSum(new Integer[] {1});

        // then:
        assertThat(result).isEqualTo(new Integer[] {1});
    }

    @Test
    void sortSum3() {
        // when:
        Integer[] result = ArraySortSum.sortSum(new Integer[] {1, 2, 3, 4, 5});

        // then:
        assertThat(result).isEqualTo(new Integer[] {1, 2, 3, 4, 5});
    }

    @Test
    void sortSum4() {
        // when:
        Integer[] result = ArraySortSum.sortSum(new Integer[] {1, 202, 3, 4, 50});

        // then:
        assertThat(result).isEqualTo(new Integer[] {1, 3, 202, 4, 50});
    }

    @Test
    void sortSum5() {
        // when:
        Integer[] result = ArraySortSum.sortSum(new Integer[] {1, 2, 3, 4, 11});

        // then:
        assertThat(result).isEqualTo(new Integer[] {1, 2, 11, 3, 4});
    }
}