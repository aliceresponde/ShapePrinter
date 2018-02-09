package com.aliceresponde;

import com.aliceresponde.util.Write;

public class Rhombus extends Shape {
    public Rhombus() {
    }

    public Rhombus(int base) {
        super(base);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        if (hight == 0)
            return Write.ENTER;
        else if (hight == 1)
            return Write.ASTERISK;
        else {
            createSuperiorTriangle(output);

            int mitleLine = 2 * hight - 1;
            output.append(Write.printLineWithAsterisks(mitleLine));

            for(int spaces= 1; spaces < hight; spaces ++){
                output.append(Write.lineWithLateralSpaces(spaces, mitleLine -(2*spaces)))
                        .append(Write.ENTER);
            }
            return output.toString();
        }

    }

    private void createSuperiorTriangle(StringBuilder output) {
        int nSpaces;
        for (int level = 1, asterisk = 1; level < hight; ++level) {
            nSpaces = hight - level;
            output.append(Write.lineWithLateralSpaces(nSpaces, asterisk))
                    .append(Write.ENTER);
            
            asterisk += 2;
        }
    }
}
