package dev.martabernardo.multiplication_table.multiplicationtable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

    @Test
    @DisplayName("Test devuelve producto de un número por otro")
    void testReturnsProductNumberToNumber() {
        int factor1 = 3;

        MultiplicationTable multiplicationTable = new MultiplicationTable(factor1);
        
        int factor2 = 2;
        int resultExpected = 6;
        int result = multiplicationTable.multiply(factor2);

        assertEquals(resultExpected, result);
        
    }
    


}
