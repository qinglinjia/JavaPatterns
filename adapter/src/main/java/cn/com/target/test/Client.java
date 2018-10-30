package cn.com.target.test;

import cn.com.target.adapater.ScoreOperation;
import cn.com.target.util.XMLUtil;

/**
 * 测试适配器模式
 *
 * @author jiaql
 * @create 2017-04-26 18:55
 */
public class Client {

    public static void main(String[] args) {
        int[] scores = {84, 76, 50, 69, 90, 91, 88, 96}; //定义成绩数组
        int[] result;
        int score;

        ScoreOperation scoreOperation; // 针对接口编程
        Object obj = XMLUtil.getBean();

        if (obj != null && obj instanceof ScoreOperation) {
            scoreOperation = (ScoreOperation) obj;

            result = scoreOperation.sort(scores);

            score = scoreOperation.search(result, 90);

            //遍历输出成绩
            for (int i : scores) {
                System.out.print(i + ",");
            }
            System.out.println();

            score = scoreOperation.search(result, 90);
            if (score != -1) {
                System.out.println("找到成绩90。");
            } else {
                System.out.println("没有找到成绩90。");
            }

            System.out.println("查找成绩92：");
            score = scoreOperation.search(result, 92);
            if (score != -1) {
                System.out.println("找到成绩92。");
            } else {
                System.out.println("没有找到成绩92。");
            }
        }
    }
}
