package image;

import api.ImageImp;

/**
 * 所有图片的抽象类
 *
 * @author jiaql
 * @create 2017-04-27 16:36
 */
public abstract class Image {

    protected ImageImp imp;

    public void setImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
