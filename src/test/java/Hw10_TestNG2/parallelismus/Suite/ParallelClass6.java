package Hw10_TestNG2.parallelismus.Suite;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ParallelClass6 {
    @Test
    public void parallel26() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel27() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel28() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel29() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel30() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
}
