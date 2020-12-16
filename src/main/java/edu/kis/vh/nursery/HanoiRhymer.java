package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
    //tabulacja przy instrukcjach if else oras przy deklaracji zmiennej totalRejected jest nieprawidłowa
    //klawisz alt + backspace powoduje powrót w ostatio edytowane miejsce
}
