package cn.com.simpleFactory01.test;

import cn.com.simpleFactory01.factory.ChartFactory;
import cn.com.simpleFactory01.product.Chart;
import cn.com.simpleFactory01.util.XMLUtil;

/**
 * 测试简单工厂
 *
 * @author jiaql
 * @create 2017-04-25 14:15
 */
public class ChartFactoryTest {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart(XMLUtil.getType());

        chart.display();
    }
}
