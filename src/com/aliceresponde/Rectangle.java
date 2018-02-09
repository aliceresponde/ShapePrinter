package com.aliceresponde;

import com.aliceresponde.util.Write;

public class Rectangle  extends Shape{

    public Rectangle() {
    }

    public Rectangle(int base) {
        super(base);
    }

    @Override
    public String toString() {
        if (hight == 0)
            return Write.ENTER;

        String line = Write.printLineWithAsterisks(hight);
        return Write.repeatLine(line, hight);
    }
}
