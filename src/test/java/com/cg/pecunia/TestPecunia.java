package com.cg.pecunia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

class TestPecunia extends TestCase{


    public  TestPecunia(String testName)
    {
        super(testName);
    }

    public static TestSuite TestSuite()
    {
        return new TestSuite(TestPecunia.class);
    }

    public void testApp()
    {
        assertTrue( true );
    }

}
