package Hw10_TestNG2.parallelismus.Suite;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ParallelClass4 {
    @Test
    public void parallel16() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel17() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel18() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel19() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel20() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
}
