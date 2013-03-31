package simple.simpleImpl;

import simple.SimpleSort;
import tools.ArrayTools;

/**
 * Created with IntelliJ IDEA.
 * User: iohanax
 * Date: 13-3-31
 * Time: 下午8:13
 * To change this template use File | Settings | File Templates.
 */
public class BottomUpSort implements SimpleSort {
    private int[] array;
    private int[] temp;

    public BottomUpSort(int[] array) {
        this.array = array;
        temp = new int[array.length];
    }

    @Override
    public int[] sort() {
        int end = 1, len = array.length;
        while (end < len) {
            int mid = end, begin = 0;
            end = 2 * mid;
            while (begin + end <= len) {
                merge(begin, begin + mid - 1, begin + end - 1);
                begin += end;
            }
            if (begin + mid < len) {
                merge(begin, begin + mid - 1, len - 1);
            }
            for (int i = 0; i < temp.length; i++) {
                array[i] = temp[i];
            }
        }
        return array;  //To change body of implemented methods use File | Settings | File Templates.
    }

    private void merge(int begin, int mid, int end) {
        int secondBegin = mid + 1;
        int tempBegin = begin;
        while (begin <= mid && secondBegin <= end) {
            if (array[begin] <= array[secondBegin]) {
                temp[tempBegin] = array[begin];
                begin++;
            } else {
                temp[tempBegin] = array[secondBegin];
                secondBegin++;
            }
            tempBegin++;
        }
        int nextBegin = begin == (mid + 1) ? secondBegin : begin;
        int nextEnd = mid - begin + end - secondBegin + 1 + nextBegin;
        while (nextBegin <= nextEnd) {
            temp[tempBegin] = array[nextBegin];
            tempBegin++;
            nextBegin++;
        }
    }
}
