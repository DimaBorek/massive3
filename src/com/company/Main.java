package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayR = new int[8];
        for (int i = 0; i < arrayR.length; i++) {
            arrayR[i] = (int) (Math.random() * 9+1);
            System.out.print(arrayR[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < arrayR.length; i++) {
            if (arrayR[i] % 2 == 1) {
                arrayR[i] = 0;
            }
            System.out.print(arrayR[i]+" ");

        }
    }
}
