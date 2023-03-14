package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class BubbleSort extends GenericAlgorithm {

    public BubbleSort() {
        super("BubbleSort", "Slow O(N^2)", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {

        // O(N^2)
        int[] b = (int[]) super.getData();

        for (int i = 1; i < b.length; i++) { // O(N)
            for (int j = 0; j < b.length - i; j++) { // O(N)
                if (b[j] > b[j + 1]) {
                    int tmp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = tmp;
                }
            }
        }

    }
}
