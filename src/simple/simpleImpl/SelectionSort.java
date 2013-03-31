package simple.simpleImpl;

import simple.SimpleSort;

/**
 * Created with IntelliJ IDEA.
 * User: iohanax
 * Date: 13-3-31
 * Time: 下午6:28
 * To change this template use File | Settings | File Templates.
 */
public class SelectionSort implements SimpleSort{

    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        for (int i = 0, len = array.length - 1; i < len; i++) {
            int k = i;
            for (int j = i + 1; j <= len; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
        }
        return array;
    }
}
