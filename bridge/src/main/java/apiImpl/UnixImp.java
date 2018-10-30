package apiImpl;

import api.ImageImp;

/**
 * /Unix操作系统实现类：具体实现类
 *
 * @author jiaql
 * @create 2017-04-28 13:42
 */
public class UnixImp implements ImageImp {
    public void doPaint(Matrix m) {
        //调用Unix系统的绘制函数绘制像素矩阵
        System.out.println("在Unix操作系统中显示图像：");
        m.print();
    }
}
