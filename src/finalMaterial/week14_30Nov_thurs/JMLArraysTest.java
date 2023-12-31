package finalMaterial.week14_30Nov_thurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JMLArraysTest {

    @Test
    void getStringLengths() {
        //should generate exception when precondition is violated
        assertThrows(IllegalArgumentException.class, () ->
        {
            JMLArrays.getStringLengths(null);
        });

        //test a good example
        assertArrayEquals(new int[]{3,1},
                JMLArrays.getStringLengths(new String[]{"cat", "a"}));
    }

    @Test
    void min() {

    }
}