package com.example.tae.tdd_example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSetTest {

    SimpleSet simpleSet;
    @Before
    public void setUp() throws Exception {

        simpleSet=new SimpleSet ();

    }

    //execution and verification

    // in our case we will just ask if is empty or not
    @Test
    public void simpleSet_ifSimpleSetIsEmpty_returnTrue() {

        assertTrue( simpleSet.isEmpty());

    }

    @Test
    public void simpleSet_ifSimpleTestIsNotEmpty_returnFalse() {

        simpleSet.addElement(6);

        assertFalse( simpleSet.isEmpty() );
    }

    @Test
    public void simpleSet_ifSimpleSetIsNotEmpty_returnCount() {

        simpleSet.addElement( 1 );
        simpleSet.addElement( 2 );

        assertEquals(2,simpleSet.elementCount());
    }

    @Test
    public void simpleSet_ifSimpleSetContainsElements_returnTrue() {

        simpleSet.addElement( 1 );
        simpleSet.addElement( 2 );

        assertTrue( simpleSet.contains (1) );
        assertTrue( simpleSet.contains(2) );

    }

    @Test
    public void simpleSet_ifSimpleSetDoesNotContain_returnFalse() {

        assertFalse( simpleSet.contains( 1 ) );
    }

    @Test
    public void simpleSet_ElementRemoved_returned_setDoesNotContainElement() {

        simpleSet.addElement( 1 );
        assertTrue( simpleSet.contains( 1 ) );

        simpleSet.removeElement(1);

        assertFalse( simpleSet.contains( 1 ) );
    }

    @Test
    public void simpleSet_ifElementRemoved_returnNewCount() {
        simpleSet.addElement( 1 );
        assertTrue( simpleSet.contains( 1 ) );
        assertEquals( 1, simpleSet.elementCount() );

        simpleSet.removeElement(1);

        assertFalse( simpleSet.contains( 1 ) );
        assertEquals( 0,simpleSet.elementCount() );
    }

    @Test
    public void simpleSet_ifDoublicatedelementAdded_reurnFalse() {

        simpleSet.addElement( 1 );

        assertFalse( simpleSet.addElement( 1 ) );
    }
}
