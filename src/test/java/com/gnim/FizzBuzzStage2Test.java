package com.gnim;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple FizzBuzz testing Stage 2.
 */
public class FizzBuzzStage2Test {

    private final ByteArrayOutputStream outputForStage2 = new ByteArrayOutputStream();

    private FizzBuzz fizzBuzz;
    private IFunGame iFunGame;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputForStage2));
        iFunGame = new Stage2(3, 5);
        fizzBuzz = new FizzBuzz(iFunGame, 1, 15);
    }

    @After
    public void tearDown() throws Exception {
        outputForStage2.close();
    }

    @Test
    public void testFizzBuzzStage1() {
        fizzBuzz.printFizzBuzzStage2();
        String number[] = outputForStage2.toString().split("\n");
        assertEquals(16, number.length);
        assertEquals("Printing Stage 2 Output ", number[0]);
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
        assertEquals("Fizz", number[13]);
        assertEquals("14", number[14]);
        assertEquals("FizzBuzz", number[15]);
    }
}
