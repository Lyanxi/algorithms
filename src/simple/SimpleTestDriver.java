package simple;

import simple.simpleImpl.BinarySearch;
import simple.simpleImpl.LinearSearch;
import simple.simpleImpl.MergeSortedArrays;
import tools.CreateArrays;

/**
 * Created with IntelliJ IDEA.
 * User: iohanax
 * Date: 13-3-30
 * Time: 下午2:40
 * To change this template use File | Settings | File Templates.
 */
public class SimpleTestDriver {
    SimpleSearch simpleSearch;
    CreateArrays arrays;
    int searchPosition;

    public SimpleTestDriver() {
        this.arrays = new CreateArrays();
        this.simpleSearch = new MergeSortedArrays(this.arrays.getMergeSortedArray());   //change the SimpleSearch
        this.searchPosition = (int) Math.floor(Math.random() * 10);
    }

    private void searchTest() {
        int result = simpleSearch.search(searchPosition);
        if (result == searchPosition) {
            System.out.printf("Find it!");
        }
    }

    public static void main(String[] args) {
        SimpleTestDriver simpleTest = new SimpleTestDriver();
        simpleTest.searchTest();
    }
}
