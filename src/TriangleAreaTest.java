import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {
    @Test
    public void triangleAreaWithInts(){
        Triangle t1 = new Triangle(12,2,13);
        assertEquals("10.79", Main.area(t1));

    }

    @Test
    public void triangleAreaWithFloats(){
        Triangle t1 = new Triangle(12.5f,2.42f,13.4f);
        assertEquals("14.48", Main.area(t1));
    }

}