package cn.com.target.adapater;

import cn.com.target.adapaterTarget.BinarySearch;
import cn.com.target.adapaterTarget.QuickSort;

/**
 * 操作适配器
 *
 * @author jiaql
 * @create 2017-04-26 18:47
 */
public class OperationAdapter implements ScoreOperation {

    private BinarySearch binarySearch;

    private QuickSort quickSort;

    public OperationAdapter() {
        binarySearch = new BinarySearch();
        quickSort = new QuickSort();
    }

    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array, key);
    }
}
