package jslink;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {

    @Test
    public void testCal(){
        assertEquals(5, new Main().cal(2,3));
    }

    @Test
    public void testCal2(){
        assertEquals(8, new Main().cal(3,5));
    }
}
