package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    static final Sample sample = new Sample();

    @Test
    public void negativeNumber () {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> new Sample().fact(-5));
    }

    @Test
    public void addFiveOp() {
        int x = 4;
        int y = 1;
        Assertions.assertThat(5).isEqualTo(sample.op(Sample.Operation.ADD, x,y));
    }

    @Test
    public void mulHeightOp() {
        int x = 4;
        int y = 2;
        Assertions.assertThat(8).isEqualTo(sample.op(Sample.Operation.MULT, x,y));
    }

    @Test
    public void factZero() {
        int x = 0;
        Assertions.assertThat(1).isEqualTo(sample.fact(x));
    }
}
