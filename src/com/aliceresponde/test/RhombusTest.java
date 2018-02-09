package com.aliceresponde.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.aliceresponde.Rhombus;
import com.aliceresponde.Shape;
import com.aliceresponde.util.Write;

public class RhombusTest {

    private StringBuilder builder;
    Shape rhombous;

    @Before
    public void init() {
        builder = new StringBuilder();
    }

    @Test
    public void printRhombusHight0() {
        rhombous = new Rhombus(0);
        Assert.assertEquals(Write.ENTER, rhombous.toString());
    }

    @Test
    public void printRhombusHight1() {
        rhombous = new Rhombus(1);
        builder.append(Write.ASTERISK);
        Assert.assertEquals(builder.toString(), rhombous.toString());
    }
    @Test
    public void printRhombusHight2() {
        rhombous = new Rhombus(2);
        builder.append(" * ").append(Write.ENTER);
        builder.append("***").append(Write.ENTER);
        builder.append(" * ").append(Write.ENTER);
        Assert.assertEquals(builder.toString(), rhombous.toString());
    }

    @Test
    public void printRhombusDefault() {
        rhombous = new Rhombus();
        builder.append("  *  ").append(Write.ENTER);
        builder.append(" *** ").append(Write.ENTER);
        builder.append("*****").append(Write.ENTER);
        builder.append(" *** ").append(Write.ENTER);
        builder.append("  *  ").append(Write.ENTER);
        Assert.assertEquals(builder.toString(), rhombous.toString());
    }
}
