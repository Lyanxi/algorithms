package simple;

import simple.simpleImpl.*;
import tools.ArrayTools;

/**
 * Created with IntelliJ IDEA.
 * User: iohanax
 * Date: 13-3-30
 * Time: 下午2:40
 * To change this template use File | Settings | File Templates.
 */
public class SimpleTestDriver {
    SimpleSearch simpleSearch;
    SimpleSort simpleSort;
    ArrayTools arrayTool;
    int[] array;
    int searchPosition;

    public SimpleTestDriver() {
        this.arrayTool = new ArrayTools();
        this.array = this.arrayTool.getIntArray();
        this.simpleSearch = new BinarySearch(this.array);   //change the SimpleSearch
        this.simpleSort = new BottomUpSort(this.array);
        this.searchPosition = (int) Math.floor(Math.random() * 10);
    }

    private void searchTest() {
        int result = simpleSearch.search(searchPosition);
        if (result == searchPosition) {
            System.out.println("Find it!");
        }
    }

    private void sortTest() {
        System.out.println("before the sorting: ");
        arrayTool.displayArray(array);
        System.out.println("\nafter the sorting: ");
        int[] result = simpleSort.sort();
        arrayTool.displayArray(result);
    }

    public static void main(String[] args) {
        SimpleTestDriver simpleTest = new SimpleTestDriver();
//        simpleTest.searchTest();
        simpleTest.sortTest();
    }
}
