package wang;

import junit.framework.Assert;

import org.junit.jupiter.api.Test;


public class TestCalc{
    @Test
    public void testAdd() {
        Calc calculator = new Calc();
        int result = calculator.add(4, 3);
        Assert.assertEquals(7, result);
    }
}
