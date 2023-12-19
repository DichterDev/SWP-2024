import at.dichter.DataGenerator;
import at.dichter.algorithms.BubbleSort;
import at.dichter.algorithms.IAlgorithm;

public class Main {
    public static void main(String[] args) {
        int[] data = DataGenerator.generateData(100);
        IAlgorithm algo = new BubbleSort();
        System.out.println("Input Array:");
        DataGenerator.printArray(data);
        data = algo.sort(data);
        System.out.println("Sorted Array:");
        DataGenerator.printArray(data);
    }
}
