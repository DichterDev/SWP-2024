package at.dichter.algorithms;

public class BubbleSort implements IAlgorithm {
    @Override
    public int[] sort(int[] array) {
        int length = array.length;
        int value = 0;

        for(int i = 0; i < length - 1; i++) {
            for(int j = 0; j < length - i - 1; i++) {
                if(array[j] > array[j + 1]) {
                    value = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = value;
                }
            }
        }

        return array;
    }
}
