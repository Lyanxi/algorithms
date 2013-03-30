package simple.simpleImpl;

import simple.SimpleSearch;

/**
 * Created with IntelliJ IDEA.
 * User: iohanax
 * Date: 13-3-30
 * Time: 下午3:08
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch implements SimpleSearch {
    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    @Override
    public int search(int searchPosition) {
        int low = 0, high = array.length, position = -1, mid = -1;
        while (low <= high) {
            mid = (int) (Math.floor(low + high) / 2);
            if (array[mid] == searchPosition) {
                position = mid;
                break;
            } else if (searchPosition < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return position;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
