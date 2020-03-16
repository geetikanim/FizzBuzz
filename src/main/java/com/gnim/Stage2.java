package com.gnim;

/**
 * This class depicts Stage 2 of the Fun Game where it takes 2 values n1, n2 as the 2
 * divisibility criterion but with a different Fizz, Buzz and FizzBuzz conditions.
 * <p>
 * Created by geetikanim
 */
public class Stage2 implements IFunGame {

    private int n1;
    private int n2;

    public Stage2(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }


    /**
     * Checks if a number is a multiple of n1 OR contains n1 AND if a number is a multiple
     * of n2 OR contains n2 then its a FizzBuzz
     *
     * @param i - number in the sequence
     * @return true if FizzBuzz condition is met, else return false.
     */
    @Override
    public boolean isFizzBuzz(int i) {
        return isIMultipleOfNOrIContainsN(i, n1) && isIMultipleOfNOrIContainsN(i, n2);
    }

    /**
     * Checks if a number is a multiple of n1 OR contains n1 then its a Fizz.
     *
     * @param i - number in the sequence.
     * @return true if Fizz condition is met, else return false.
     */
    @Override
    public boolean isFizz(int i) {
        return isIMultipleOfNOrIContainsN(i, n1);
    }

    /**
     * Checks if a number is a multiple of n2 OR contains n2 then its a Buzz.
     *
     * @param i - number in the sequence.
     * @return true if Buzz condition is met, else return false.
     */
    @Override
    public boolean isBuzz(int i) {
        return isIMultipleOfNOrIContainsN(i, n2);

    }
}
