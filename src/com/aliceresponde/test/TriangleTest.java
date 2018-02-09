package com.aliceresponde.test;

import com.aliceresponde.Shape;
import com.aliceresponde.Triangle;
import com.aliceresponde.util.Write;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
    private StringBuilder builder;
    private Shape triangle;

    @Before
    public void init() {
        builder = new StringBuilder();
    }

    @Test
    public void printTiangleHight0() {
        triangle = new Triangle(0);
        Assert.assertEquals(Write.ENTER, triangle.toString());
    }

    @Test
    public void printTiangleHight1() {
        triangle = new Triangle(1);
        Assert.assertEquals(Write.printLineWithAsterisks(1), triangle.toString());
    }

    @Test
    public void printTiangleHightDefault() {
        triangle = new Triangle();
        builder.append("  *  ").append(Write.ENTER);
        builder.append(" *** ").append(Write.ENTER);
        builder.append("*****").append(Write.ENTER);
        Assert.assertEquals(builder.toString(), triangle.toString());
    }

    @Test
    public void printTiangleHight7() {
        triangle = new Triangle(7);
        builder.append("      *      ").append(Write.ENTER);
        builder.append("     ***     ").append(Write.ENTER);
        builder.append("    *****    ").append(Write.ENTER);
        builder.append("   *******   ").append(Write.ENTER);
        builder.append("  *********  ").append(Write.ENTER);
        builder.append(" *********** ").append(Write.ENTER);
        builder.append("*************").append(Write.ENTER);
        Assert.assertEquals(builder.toString(), triangle.toString());
    }

}
