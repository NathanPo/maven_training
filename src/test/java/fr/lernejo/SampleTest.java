package fr.lernejo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    static final Sample sample = new Sample();

    @Test
    public void negativeNumber () {
        assertThrows(IllegalArgumentException.class, () -> new Sample().fact(-5));
    }

    @Test
    public void addFiveOp() {
        int x = 4;
        int y = 1;
        assertEquals(5, sample.op(Sample.Operation.ADD, x,y));
    }

    @Test
    public void mulHeightOp() {
        int x = 4;
        int y = 2;
        assertEquals(8, sample.op(Sample.Operation.MULT, x,y));
    }

    @Test
    public void factZero() {
        int x = 0;
        assertEquals(1, sample.fact(x));
    }
}
