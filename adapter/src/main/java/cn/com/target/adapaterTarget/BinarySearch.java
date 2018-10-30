package cn.com.target.adapaterTarget;

/**
 * 二分查找类：适配者
 *
 * @author jiaql
 * @create 2017-04-26 18:02
 */
public class BinarySearch {
    public int binarySearch(int[] array, int key) {

        int low = 0;
        int high = array.length - 1;

        while(low < high) {
            int mid = (low + high) /2;
            if(key < array[mid]) {
                high = mid -1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return 1;
            }
        }
        return -1;
    }
}
