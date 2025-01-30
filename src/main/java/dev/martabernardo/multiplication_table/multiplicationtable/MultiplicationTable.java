package dev.martabernardo.multiplication_table.multiplicationtable;

public class MultiplicationTable {

    private int number;
    
    public MultiplicationTable(int factor1) {
        this.number = factor1;
    }

    public int multiply(int factor2) {
        return number*factor2;     
    }

}
