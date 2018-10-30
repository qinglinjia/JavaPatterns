package api;

import apiImpl.Matrix;

/**
 * 抽象操作系统实现类：实现类接口
 *
 * @author jiaql
 * @create 2017-04-28 13:36
 */
public interface ImageImp {

    //显示像素矩阵m
    void doPaint(Matrix m);
}
