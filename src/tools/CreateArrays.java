package tools;

/**
 * Created with IntelliJ IDEA.
 * User: iohanax
 * Date: 13-3-30
 * Time: 下午2:20
 * To change this template use File | Settings | File Templates.
 */
public class CreateArrays {
    public int[] getIntArray(){
        int[] result = new int[10];
        for (int i=0;i<10;i++){
             result[i] = i;
        }
        return result;
    }
    public int[] getMergeSortedArray(){
        return new int[]{2, 3, 66, 7, 11, 13, 45, 57};
    }
}
