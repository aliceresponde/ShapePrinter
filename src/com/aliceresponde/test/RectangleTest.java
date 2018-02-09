package com.aliceresponde.test;

import com.aliceresponde.Rectangle;
import com.aliceresponde.Shape;
import com.aliceresponde.util.Write;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
    private StringBuilder builder;
    private Shape rectangle;

    @Before
    public void init() {
        builder = new StringBuilder();
    }

    @Test
    public void imprimirRectanguloConBase0() {
        rectangle = new Rectangle(0);
        Assert.assertEquals(Write.ENTER, rectangle.toString());
    }

    @Test
    public void imprimirRectanguloConBase1() {
        rectangle = new Rectangle(1);
        Assert.assertEquals(builder.append(Write.ASTERISK).append(Write.ENTER).toString(),
                rectangle.toString());
    }

    @Test
    public void imprimitRectaguloPorDefecto() {
        rectangle = new Rectangle();
        builder.append("***").append(Write.ENTER);
        builder.append("***").append(Write.ENTER);
        builder.append("***").append(Write.ENTER);
        Assert.assertEquals(builder.toString(), rectangle.toString());
    }

    @Test
    public void imprimirRectanguloConBase5() {
        rectangle = new Rectangle(5);
        builder.append("*****").append(Write.ENTER);
        builder.append("*****").append(Write.ENTER);
        builder.append("*****").append(Write.ENTER);
        builder.append("*****").append(Write.ENTER);
        builder.append("*****").append(Write.ENTER);
        Assert.assertEquals(builder.toString(), rectangle.toString());
    }
}
