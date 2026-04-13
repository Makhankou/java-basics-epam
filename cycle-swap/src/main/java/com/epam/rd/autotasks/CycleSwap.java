package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int[] newArray = new int[array.length];
        newArray[0] = array[array.length - 1];
        System.arraycopy(array, 0, newArray, 1, array.length - 1);
        System.arraycopy(newArray, 0, array, 0, array.length);
    }

    static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length == 0 || shift == 0) {
            return;
        }

        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, shift, array.length - shift);
        System.arraycopy(array, array.length - shift, newArray, 0, shift);
        System.arraycopy(newArray, 0, array, 0, array.length);
    }
}
