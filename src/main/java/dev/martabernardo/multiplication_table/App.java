package dev.martabernardo.multiplication_table;

import dev.martabernardo.multiplication_table.multiplicationtable.MultiplicationTable;

public final class App {
    private App() {
    }
    public static void main(String[] args) {
        int num=5;
        for (int i = 1; i <= 10; i++) {
            String result = iteration(num, i);
            System.out.println(result);
        }
    }

    public static String iteration(int num, int numIter) {
        MultiplicationTable multiplicationTable = new MultiplicationTable(num);
        return multiplicationTable.completeMultiplication(numIter);
    }
}
