package com.aliceresponde;

import com.aliceresponde.util.Write;

public class Triangle extends Shape {
    public Triangle() {
    }

    public Triangle(int base) {
        super(base);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        if (hight == 0) {
            return Write.ENTER;
        } else if (hight == 1) {
            return output.append(Write.ASTERISK).append(Write.ENTER).toString();
        } else {
            for (int level = 1, asterisk = 1; level <= hight; ++level) {
                output.append(Write.lineWithLateralSpaces(hight - level, asterisk))
                        .append(Write.ENTER);
                asterisk += 2;
            }
            return output.toString();
        }
    }
}
