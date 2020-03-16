package com.gnim;

/**
 * Main Class
 * <p>
 * Created by geetikanim
 */
public class FizzBuzz {

    private IFunGame iFunGame;
    private int start;
    private int end;

    /**
     * Constructor
     *
     * @param iFunGame - is an implementation of {@link IFunGame} (Stage1/Stage2)
     * @param start    - is the start of the sequence
     * @param end      - is the end of the sequence
     */
    public FizzBuzz(IFunGame iFunGame, int start, int end) {
        this.iFunGame = iFunGame;
        this.start = start;
        this.end = end;
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        IFunGame iFunGame = new Stage1(3, 5);
        FizzBuzz fizzBuzz = new FizzBuzz(iFunGame, 1, 100);
        fizzBuzz.printFizzBuzzStage1();

        iFunGame = new Stage2(3, 5);
        fizzBuzz = new FizzBuzz(iFunGame, 1, 100);
        fizzBuzz.printFizzBuzzStage2();
    }

    /**
     * This method is checking Fizz, Buzz and FizzBuzz Stage 1 condition on a number
     * and printing text accordingly.
     */
    public void printFizzBuzzStage1() {
        System.out.println("Printing Stage 1 Output ");
        for (int i = start; i <= end; i++) {
            if (iFunGame.isFizzBuzz(i)) System.out.println("FizzBuzz");
            else if (iFunGame.isFizz(i)) System.out.println("Fizz");
            else if (iFunGame.isBuzz(i)) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    /**
     * This method is checking Fizz, Buzz and FizzBuzz Stage 2 condition on a number
     * and printing text accordingly.
     */
    public void printFizzBuzzStage2() {
        System.out.println("Printing Stage 2 Output ");
        for (int i = start; i <= end; i++) {
            if (iFunGame.isFizzBuzz(i)) System.out.println("FizzBuzz");
            else if (iFunGame.isFizz(i)) System.out.println("Fizz");
            else if (iFunGame.isBuzz(i)) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}