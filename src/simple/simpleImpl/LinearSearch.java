package simple.simpleImpl;

import simple.SimpleSearch;

/**
 * Created with IntelliJ IDEA.
 * User: iohanax
 * Date: 13-3-30
 * Time: 下午2:17
 * To change this template use File | Settings | File Templates.
 */
public class LinearSearch implements SimpleSearch {
    private int[] array;

    public LinearSearch(int[] array) {
        this.array = array;
    }

    public int search(int searchPosition) {
        int position = -1;
        for (int i = 0, len = array.length; i < len; i++) {
            if (array[searchPosition] == array[i]) {
                position = i;
                break;
            }
        }
        return position;
    }
}
