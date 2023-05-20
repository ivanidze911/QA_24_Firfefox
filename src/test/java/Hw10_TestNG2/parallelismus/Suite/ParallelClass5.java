package Hw10_TestNG2.parallelismus.Suite;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ParallelClass5 {
    @Test
    public void parallel21() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel22() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel23() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel24() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel25() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
}
