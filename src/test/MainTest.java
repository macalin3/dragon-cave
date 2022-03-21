import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main newMain = new Main();

    @Test
    void firstTest() {
        assertEquals(1, newMain.getOption(1), "test failed, must choose 1 or 2");
    }

    @Test
    void secondTest() {
        assertEquals(2, newMain.getOption(2), "test failed, must choose 1 or 2");
    }
}