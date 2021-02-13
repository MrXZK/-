package shoot;

import java.util.Random;

public class BigAirplane extends FlyingObject{
    private int speed;

    /* 构造方法 */
    BigAirplane(){
        super(66,89);
        speed =2;
    }
    /* 重写移动方法权限必须大于等于超类的方法 */
    public void step(){
        System.out.println("大敌机的y向下移动了");
    }

}
