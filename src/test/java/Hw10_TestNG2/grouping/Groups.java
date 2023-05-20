package Hw10_TestNG2.grouping;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Groups {
    @Test (priority = 1, groups = "first")
    public void one(){
        assertTrue(true);
    }
    @Test (priority = 2, groups = "second")
    public void two(){
        assertTrue(true);
    }
    @Test (priority = 3, groups = "first")
    public void three(){
        assertTrue(true);
    }
    @Test (priority = 4, groups = "second")
    public void four(){
        assertTrue(true);
    }
    @Test (priority = 5, groups = "first")
    public void five(){
        assertTrue(true);
    }
    @Test (priority = 6, groups = "second")
    public void six(){
        assertTrue(true);
    }
    @Test (priority = 7, groups = "first")
    public void seven(){
        assertTrue(true);
    }
    @Test (priority = 8, groups = "second")
    public void eight(){
        assertTrue(true);
    }
}
