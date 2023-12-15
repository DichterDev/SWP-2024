package at.dichter;

import java.util.Random;

public class DataGenerator {
    private static Random random = new Random();
    public static int[] generateData(int n) {
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static int[] generateData(int n, int min, int max) {
        int[] array = new int[n];
        for(var i : array) {
            i = random.nextInt(min, max);
        }

        return array;
    }

    public static String printArray(int[] array) {
        String output = "";
        for(var i : array) {
            output += String.format("{} ", i);
        }

        return output;
    }
}
