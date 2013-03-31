package simple.simpleImpl;

import simple.SimpleSearch;
import simple.SimpleSort;

/**
 * Created with IntelliJ IDEA.
 * User: iohanax
 * Date: 13-3-31
 * Time: 下午7:23
 * To change this template use File | Settings | File Templates.
 */
public class InsertionSort implements SimpleSort {
    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    @Override
    public int[] sort() {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int x = array[i];
            while (j >= 0 && array[j] > x) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = x;
        }
        return array;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
