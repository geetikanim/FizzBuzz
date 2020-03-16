package com.gnim;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test class to test Stage 1 Fizz, Buzz and FizzBuzz test cases.
 * <p>
 * Created by geetikanim
 */
public class Stage1Test {

    private IFunGame iFunGame;

    @Before
    public void setUp() {
        iFunGame = new Stage1(3, 5);
    }

    @Test
    public void testisFizzBuzz() {

        assertFalse(iFunGame.isFizzBuzz(2));
        assertFalse(iFunGame.isFizzBuzz(10));
        assertFalse(iFunGame.isFizzBuzz(18));

        assertTrue(iFunGame.isFizzBuzz(15));
        assertTrue(iFunGame.isFizzBuzz(30));
        assertTrue(iFunGame.isFizzBuzz(45));

        assertFalse(iFunGame.isFizzBuzz(19));
        assertFalse(iFunGame.isFizzBuzz(23));
        assertFalse(iFunGame.isFizzBuzz(55));

    }

    @Test
    public void testisFizz() {

        assertFalse(iFunGame.isFizz(4));
        assertFalse(iFunGame.isFizz(8));
        assertFalse(iFunGame.isFizz(11));

        assertTrue(iFunGame.isFizz(3));
        assertTrue(iFunGame.isFizz(6));
        assertTrue(iFunGame.isFizz(9));

    }

    @Test
    public void testisBuzz() {

        assertFalse(iFunGame.isBuzz(4));
        assertFalse(iFunGame.isBuzz(8));
        assertFalse(iFunGame.isBuzz(11));

        assertTrue(iFunGame.isBuzz(5));
        assertTrue(iFunGame.isBuzz(10));
        assertTrue(iFunGame.isBuzz(20));

    }
}
