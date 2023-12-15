package at.dichter.algorithms;

public class InsertionSort implements IAlgorithm {
    @Override
    public int[] sort(int[] array) {
        int minimum = 0;
        int value = 0;
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; i < array.length - i - 1; i++) {
                if(array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            value = array[minimum];
            array[i] = array[minimum];
            array[minimum] = value;
        }


        return array;
    }
}
