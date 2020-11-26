import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KalkulatorTest {

    @Test
    void pluss() {
        Kalkulator kalkulator = new Kalkulator();

        int sum = kalkulator.pluss(5, 5);
        assertEquals(10, sum, "Plusset ikke tallene riktig");
    }

    @Test
    void dele() {
        Kalkulator kalkulator = new Kalkulator();

        double sum = kalkulator.dele(10, 5);
        assertEquals(2, sum, "Delte ikke tallene riktig");
    }

}