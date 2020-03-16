package com.gnim;

/**
 * This class depicts Stage 1 of the Fun Game where it takes 2 values n1, n2 as the 2
 * divisibility criterion.
 * <p>
 * <p>
 * Created by geetikanim
 */
public class Stage1 implements IFunGame {

    private int n1; // for example 3 
    private int n2; // for example 5

    public Stage1(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    /**
     * Checks if a number is a multiple of n1 and n2 then its a FizzBuzz.
     *
     * @param i - number in the sequence.
     * @return true if FizzBuzz condition is met else return false.
     */
    @Override
    public boolean isFizzBuzz(int i) {
        return isIMultipleOfN(i, n1) && isIMultipleOfN(i, n2);
    }

    /**
     * Checks if a number is a multiple of n1 then its a Fizz.
     *
     * @param i - number in the sequence.
     * @return true if Fizz condition is met else return false.
     */
    @Override
    public boolean isFizz(int i) {
        return isIMultipleOfN(i, n1);
    }

    /**
     * Checks if a number is a multiple of n2 then its a Buzz.
     *
     * @param i - number in the sequence.
     * @return true if Buzz condition is met else return false.
     */
    @Override
    public boolean isBuzz(int i) {
        return isIMultipleOfN(i, n2);
    }
}
