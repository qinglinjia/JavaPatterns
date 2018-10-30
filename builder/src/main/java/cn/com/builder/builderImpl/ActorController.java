package cn.com.builder.builderImpl;

/**
 * 游戏角色创建控制器：指挥者
 *
 * @author jiaql
 * @create 2017-04-26 17:04
 */
public class ActorController {

    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }
}
