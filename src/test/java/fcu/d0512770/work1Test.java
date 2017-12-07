package fcu.d0512770;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class work1Test {
    @Test
    public void add() throws Exception {
        work1 te = new work1();
        int x = 2;
        int y = 3;
        int exceptSum = 5;
        // Act
        int actualSum = te.add(x, y);
        // Assert
        Assert.assertEquals(exceptSum, actualSum);
    }

}
