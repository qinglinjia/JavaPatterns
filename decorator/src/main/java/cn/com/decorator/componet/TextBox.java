package cn.com.decorator.componet;

/**
 * 文本框类：具体构建类
 *
 * @author jiaql
 * @create 2017-05-04 14:25
 */
public class TextBox extends Component {
    @Override
    public void display() {
        System.out.println("显示一个文本框");
    }
}
