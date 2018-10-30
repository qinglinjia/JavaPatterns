package image;

import apiImpl.Matrix;

/**
 * BMP格式图像：扩充抽象类
 *
 * @author jiaql
 * @create 2017-04-28 13:44
 */
public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析BMP文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为BMP。");
    }
}
