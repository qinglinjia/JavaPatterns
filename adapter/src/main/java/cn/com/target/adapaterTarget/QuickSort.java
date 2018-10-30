package cn.com.target.adapaterTarget;

/**
 * //快速排序类：适配者
 *
 * @author jiaql
 * @create 2017-04-26 17:48
 */
public class QuickSort {

    public int[] quickSort(int[] array) {
        sort(array);
        return array;
    }

    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {23, 33, 22, 45, 3, 56, 12};
        quickSort.quickSort(array);

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }

    }
}
