package apiImpl;

import api.ImageImp;

/**
 * /Windows操作系统实现类：具体实现类
 *
 * @author jiaql
 * @create 2017-04-28 13:42
 */
public class WindowsImp implements ImageImp {
    public void doPaint(Matrix m) {
        //调用Windows系统的绘制函数绘制像素矩阵
        System.out.println("在Windows操作系统中显示图像：");
        m.print();
    }
}
