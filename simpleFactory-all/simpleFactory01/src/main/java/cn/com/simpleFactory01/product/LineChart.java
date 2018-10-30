package cn.com.simpleFactory01.product;

/**
 * 折线图类：具体产品类
 *
 * @author jiaql
 * @create 2017-04-25 14:12
 */
public class LineChart implements Chart {
    public void display() {
        System.out.println("显示折线图！");
    }
}
