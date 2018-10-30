package cn.com;

/**
 * //抽象文件类：抽象构件
 *
 * @author jiaql
 * @create 2017-04-28 15:46
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
