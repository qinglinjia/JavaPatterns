package util;

import api.ImageImp;
import image.Image;

/**
 * 测试
 *
 * @author jiaql
 * @create 2017-04-28 13:56
 */
public class Client {

    public static void main(String args[]) {
        Image image;
        ImageImp imp;
        image = (Image)XMLUtil.getBean("image.JPGImage");
        imp = (ImageImp)XMLUtil.getBean("apiImpl.WindowsImp");
        image.setImp(imp);
        image.parseFile("小龙女");
    }
}
