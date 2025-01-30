package dev.martabernardo.multiplication_table;

import dev.martabernardo.multiplication_table.multiplicationtable.MultiplicationTable;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String iteration(int num, int numIter) {
        MultiplicationTable multiplicationTable = new MultiplicationTable(num);
        return multiplicationTable.completeMultiplication(numIter);
    }
}
