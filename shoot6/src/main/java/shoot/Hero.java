package shoot;

import java.awt.image.BufferedImage;
import java.util.Random;

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

    int index =0;
    /* 获取图片的抽象方法入口 */
    public BufferedImage getImage(){//英雄机有两种图片，设置一个0和1来回切换的方法
        return Images.heros[index++%2];//(0+1)/2余1  (1+1)/2余0
    }

}
