package cn.com.simpleFactory01.product;

/**
 * 饼状图类：具体产品类
 *
 * @author jiaql
 * @create 2017-04-25 14:11
 */
public class PieChart implements Chart {
    public void display() {
        System.out.println("显示饼状图！");
    }
}
