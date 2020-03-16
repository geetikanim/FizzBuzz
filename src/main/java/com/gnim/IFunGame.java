package com.gnim;

/**
 * This is an interface to capture the idea of fun game with different criterion of divisibility
 * and containing. There are some unimplemented methods which needs specific implementation based
 * on the Stages of game being played. Those implementations will be provided by implementing classes
 * <p>
 * <p>
 * Created by geetikanim
 */
public interface IFunGame {

    /**
     * Checks if a number i is a multiple of n
     *
     * @param i - a number in the sequence which needs to be checked for divisibility by n.
     * @param n - value by which i's divisibility will be checked.
     * @return true if i is a multiple of n, else return false.
     */
    default boolean isIMultipleOfN(int i, int n) {
        return i % n == 0;
    }

    /**
     * Checks if a number i is a multiple of n or if number i has a 'n' in it.
     *
     * @param i - a number in the sequence which needs to be checked for divisibility by and containing of n.
     * @param n - value by which i's divisibility and containing will be checked.
     * @return true if the given condition is met, else return false.
     */
    default boolean isIMultipleOfNOrIContainsN(int i, int n) {
        return isIMultipleOfN(i, n) || String.valueOf(i).contains(String.valueOf(n));
    }

    /**
     * Checks if number falls under FizzBuzz condition.
     *
     * @param i - number in the sequence
     * @return true if number is falling under FizzBuzz criteria, else return false.
     */
    boolean isFizzBuzz(int i);

    /**
     * Checks if number falls under Fizz condition.
     *
     * @param i - number in the sequence.
     * @return true if number is falling under Fizz criteria, else return false.
     */
    boolean isFizz(int i);

    /**
     * Checks if number falls under Buzz condition.
     *
     * @param i - number in the sequence.
     * @return true if number is falling under Buzz criteria, else return false.
     */
    boolean isBuzz(int i);

}
