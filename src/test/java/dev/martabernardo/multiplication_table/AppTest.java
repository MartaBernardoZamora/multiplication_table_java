package dev.martabernardo.multiplication_table;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

class AppTest {
    @Test 
    @DisplayName("Test app functionality") 
    void testMain() { 
        App.main(new String[]{}); 
    }

    @Test
    @DisplayName("Test return correct result in iteration")
    void testName() {
        int num=5;
        int numIter=1;

        String result= App.iteration(num, numIter);

        String resultExpected="5 x 1 = 5";
        assertEquals(resultExpected, result);


    }
    
}
