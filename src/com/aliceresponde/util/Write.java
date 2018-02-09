package com.aliceresponde.util;

public final class Write {
    public static final String ENTER = String.format("%n");
    public static final String ASTERISK = "*";
    public static final String SPACE = " ";

    public Write() {
        new AssertionError("No instantiable class");
    }

    /**
     *  Fill a line with a character n-times, end on ENTER
     *
     * @param letter
     * @param nTimes
     * @return
     */
    public static String repeatCharacterSomeTimes(String letter, int nTimes) {
        StringBuilder line = new StringBuilder();
        line.append(fillLineWithNChars(letter, nTimes)).append(ENTER);
        return line.toString();
    }

    private static StringBuilder fillLineWithNChars(String letter, int nTimes) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < nTimes; ++i) {
            line.append(letter);
        }
        return line;
    }

    public static String printLineWithAsterisks(int nTimes) {
        return repeatCharacterSomeTimes(ASTERISK, nTimes);
    }

    public static String lineWithLateralSpaces(int nSpaces, int nCharacters) {
        StringBuilder output = new StringBuilder();
        return output.append(fillLineWithNChars(SPACE, nSpaces))
                .append(fillLineWithNChars(ASTERISK, nCharacters))
                .append(fillLineWithNChars(SPACE, nSpaces))
                .toString();
    }

    public static String repeatLine(String line, int nTimes) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(fillLineWithNChars(line, nTimes));
        return stringBuilder.toString();
    }
}
