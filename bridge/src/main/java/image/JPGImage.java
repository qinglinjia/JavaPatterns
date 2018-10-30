package image;

import apiImpl.Matrix;

/**
 * JPG格式图像：扩充抽象类
 *
 * @author jiaql
 * @create 2017-04-28 13:44
 */
public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析JPG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为JPG。");
    }
}
