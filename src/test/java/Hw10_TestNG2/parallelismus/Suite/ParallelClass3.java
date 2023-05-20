package Hw10_TestNG2.parallelismus.Suite;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ParallelClass3 {
    @Test
    public void parallel11() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel12() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel13() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel14() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel15() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
}
