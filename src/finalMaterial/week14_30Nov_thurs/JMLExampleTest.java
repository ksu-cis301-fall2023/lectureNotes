package finalMaterial.week14_30Nov_thurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JMLExampleTest {

    @Test
    void mult() {
        //should generate exception when precondition is violated
        assertThrows(IllegalArgumentException.class, () ->
            {
                JMLExample.mult(2, -1);
            });

        //test a good example
        assertEquals(6, JMLExample.mult(2,3));
    }
}