import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PrintNumbersTest {

    @Test
    void printNumbers() {

        ArrayList<Integer> expected =new ArrayList<>();
        for (int i = 0; i < 11; i++){
            if (i == 9 || i == 0){
                continue;
            }
            expected.add(i);
        }
        assertEquals(expected, Main.printNumbers());
    }
}