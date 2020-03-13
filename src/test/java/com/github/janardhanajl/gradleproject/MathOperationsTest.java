package com.github.janardhanajl.gradleproject;

import com.github.janardhanajl.gradeleproject.MathOperations;
import org.junit.Assert;
import org.junit.Test;

public class MathOperationsTest {

    @Test
            public void addTst() {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(3, 4);
                Assert.assertEquals(7, result);
    }


}
