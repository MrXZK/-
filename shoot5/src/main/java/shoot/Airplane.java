package shoot;

import java.util.Random;

public class Airplane extends FlyingObject {
    private int speed;

    /* 构造方法 */
    Airplane(){
        super(48,50); //调用了超类中的构造方法，并且传递了参数
        speed=2;
    }

    /* 重写移动方法权限必须大于等于超类的方法 */
    public void step(){
        System.out.println("小敌机的y向下移动了");
    }
}
