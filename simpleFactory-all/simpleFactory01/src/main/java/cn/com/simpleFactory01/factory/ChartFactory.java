package cn.com.simpleFactory01.factory;

import cn.com.simpleFactory01.product.Chart;
import cn.com.simpleFactory01.product.HistogramChart;
import cn.com.simpleFactory01.product.LineChart;
import cn.com.simpleFactory01.product.PieChart;

/**
 * 产品工厂
 *
 * @author jiaql
 * @create 2017-04-25 14:12
 */
public class ChartFactory {

    public static Chart getChart(String chartType) {
        Chart chart = null;
        if (chartType.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
        } else if (chartType.equalsIgnoreCase("line")) {
            chart = new LineChart();
        } else if (chartType.equalsIgnoreCase("pie")) {
            chart = new PieChart();
        }
        return chart;
    }
}
