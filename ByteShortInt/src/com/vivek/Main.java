package com.vivek;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32 bits
            int myMinValue = -2_47_483_648;
            int myMaxValue = 2_147_483_647;

            int totalValue = myMaxValue/2;
            System.out.println("The Total Min + Max Value "+ totalValue);

            int tmpTotalValue = totalValue;
            System.out.println("tmpTotalValue = \t" + tmpTotalValue);
        // Byte has a width of 8
            byte myByteValue = -128;
            System.out.println("myByteValue \t "  + myByteValue);
            byte newMyByteValue = (byte) myByteValue;
            System.out.println("myByteValue \t "  + newMyByteValue);
        // Short has a width of 16
            short myShortValue = 32767;
            System.out.println("myShortValue = \t"+ myShortValue );
            short tmpShortValue = (short) myShortValue;
            System.out.println("tmpShortValue \t "+ tmpShortValue);
        // Long value has a width of 64
            long myLongValue = 5000L + 10L * ( newMyByteValue +  tmpShortValue ) ;
            System.out.println(" myLongValue = \t" + myLongValue);

    }
}
