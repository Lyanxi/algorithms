package simple.simpleImpl;

import simple.SimpleSearch;
import simple.SimpleSort;

/**
 * Created with IntelliJ IDEA.
 * User: iohanax
 * Date: 13-3-30
 * Time: 下午3:41
 * To change this template use File | Settings | File Templates.
 */
public class MergeSortedArrays implements SimpleSort {
    private int[] array;

    public MergeSortedArrays(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        int begin = 0, end = 3, i = 0;
        int[] result = new int[array.length];
        while (begin <= 2 && end <= 7) {
            if (array[begin] < array[end]) {
                result[i] = array[begin];
                begin++;
            } else {
                result[i] = array[end];
                end++;
            }
            i++;
        }
        int next = begin == 3 ? end : begin;
        while (i < result.length) {
            result[i] = array[next];
            i++;
            next++;
        }
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j] + " ");
        }
        return array;
    }
}
