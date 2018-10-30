package cn.com.decorator.componet;

/**
 * 窗体类：具体构件类
 *
 * @author jiaql
 * @create 2017-05-04 14:24
 */
public class Window extends Component {
    @Override
    public void display() {
        System.out.println("显示一个窗体");
    }
}
