package ru.yandex.ai.task1;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static ru.yandex.ai.task1.TestData.DATA_3;
import static ru.yandex.ai.task1.TestData.DATA_3_STR;
import static ru.yandex.ai.task1.TestData.DATA_5;
import static ru.yandex.ai.task1.TestData.DATA_57;
import static ru.yandex.ai.task1.TestData.DATA_57_STR;
import static ru.yandex.ai.task1.TestData.DATA_5_STR;

import io.vavr.Tuple2;
import java.util.List;
import org.junit.jupiter.api.Test;

class HumidifierDataMapperTest {

    private final HumidifierDataMapper mapper = new HumidifierDataMapper();

    @Test
    void toTuplesListData3() {
        // when:
        List<Tuple2<Integer, Integer>> tuplesList = mapper.toTuplesList(DATA_3_STR);

        // then:
        assertThat(tuplesList).isEqualTo(DATA_3);
    }

    @Test
    void toTuplesListData5() {
        // when:
        List<Tuple2<Integer, Integer>> tuplesList = mapper.toTuplesList(DATA_5_STR);

        // then:
        assertThat(tuplesList).isEqualTo(DATA_5);
    }

    @Test
    void toTuplesListData57() {
        // when:
        List<Tuple2<Integer, Integer>> tuplesList = mapper.toTuplesList(DATA_57_STR);

        // then:
        assertThat(tuplesList).isEqualTo(DATA_57);
    }
}