package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int FULL = 11;
    private static final int EMPTY = -1;
    private final int[] numbers = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public int[] getNumbers() {
        return numbers;
    }


    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return getNumbers()[total--];
    }

}
