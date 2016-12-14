package com.tiy.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by crci1 on 12/12/2016.
 */
public class ChocolateMakerTest {

    ChocolateMaker maker;
    @Before
    public void setUp() throws Exception {
        maker = new ChocolateMaker();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testEnoughBigsandSmalls() throws Exception {

        int smalls = maker.makeChocolate(6,3,20);

        assertEquals(5, smalls);

    }


    @Test
    public void testLowGoals(){
        int smalls = maker.makeChocolate(4,1,9);
        assertEquals(4, smalls);
    }

    @Test
    public void testLowGoal2(){
        int smalls = maker.makeChocolate(6,2,7);
        assertEquals(2, smalls);
    }




    @Test
    public void testofSmallBars(){
        int smalls = maker.makeChocolate(4,1,4);

        assertEquals(4, smalls);
    }
    @Test
    public void testEnoughSmalls(){
        int smalls = maker.makeChocolate(14,7,49);

        assertEquals(14, smalls);
    }


    @Test
    public void testAlotOfBigsnotEnoughSmalls(){
        int smalls = maker.makeChocolate(5,10, 53);
        assertEquals(3, smalls);
    }

    @Test
    public void testLargeOrder(){
        int smalls = maker.makeChocolate(4,20,101);
        assertEquals(1,smalls);
    }

    @Test
    public void testLargeOrderNotEnoughSmalls(){
        int smalls = maker.makeChocolate(1,20,102);
        assertEquals(-1,smalls);
    }

    
    @Test
    public void testHighSmalls(){
        int smalls = maker.makeChocolate(30, 1, 36);
        assertEquals(-1,smalls);
    }

    @Test
    public void testAgagin(){
        int smalls = maker.makeChocolate(6, 2, 7);
        assertEquals(2,smalls);
    }













}