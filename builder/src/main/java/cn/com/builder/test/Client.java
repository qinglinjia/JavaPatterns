package cn.com.builder.test;

import cn.com.builder.builderImpl.Actor;
import cn.com.builder.builderImpl.ActorBuilder;
import cn.com.builder.builderImpl.ActorController;
import cn.com.builder.util.XMLUtil;

/**
 * 测试建造者模式
 *
 * @author jiaql
 * @create 2017-04-26 17:16
 */
public class Client {

    public static void main(String[] args) {

        ActorBuilder ab; //针对抽象建造者编程
        ab = (ActorBuilder) XMLUtil.getBean();

        ActorController ac = new ActorController();
        Actor actor;
        actor = ac.construct(ab); //通过指挥者创建完整的建造者对象

        String type = actor.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
    }
}
