package shoot;

public class Hero extends FlyingObject {
    private int fire;  //火力值
    private int life;  //生命值

    /* 构造方法 */
    Hero(){
        super(97,139,10,400);
       life = 3;
       fire = 0;
    }

    /* 重写移动方法权限必须大于等于超类的方法 */
    public void step(){
        System.out.println("英雄机移动了");
    }

}
