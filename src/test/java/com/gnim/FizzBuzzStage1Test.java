package com.gnim;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple FizzBuzz testing Stage 1.
 */
public class FizzBuzzStage1Test {

    private final ByteArrayOutputStream outputForStage1 = new ByteArrayOutputStream();

    private FizzBuzz fizzBuzz;
    private IFunGame iFunGame;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputForStage1));
        iFunGame = new Stage1(3, 5);
        fizzBuzz = new FizzBuzz(iFunGame, 1, 15);
    }

    @After
    public void tearDown() throws Exception {
        outputForStage1.close();
    }

    @Test
    public void testFizzBuzzStage1() {
        fizzBuzz.printFizzBuzzStage1();
        String number[] = outputForStage1.toString().split("\n");
        assertEquals(16, number.length);
        assertEquals("Printing Stage 1 Output ", number[0]);
        assertEquals("1", number[1]);
        assertEquals("2", number[2]);
        assertEquals("Fizz", number[3]);
        assertEquals("4", number[4]);
        assertEquals("Buzz", number[5]);
        assertEquals("Fizz", number[6]);
        assertEquals("7", number[7]);
        assertEquals("8", number[8]);
        assertEquals("Fizz", number[9]);
        assertEquals("Buzz", number[10]);
        assertEquals("11", number[11]);
        assertEquals("Fizz", number[12]);
        assertEquals("13", number[13]);
        assertEquals("14", number[14]);
        assertEquals("FizzBuzz", number[15]);
    }
}
