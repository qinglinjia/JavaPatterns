package cn.com.target.adapater;

/**
 * 适配器接口
 *
 * @author jiaql
 * @create 2017-04-26 18:45
 */
public interface ScoreOperation {

    int[] sort(int[] array); // 成绩排序

    int search(int[] array,int key); // 查询key

}
