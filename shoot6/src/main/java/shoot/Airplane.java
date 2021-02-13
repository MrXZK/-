package shoot;

import java.awt.image.BufferedImage;
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

    int index =1; //敌机爆炸图片的下标,不能放抽象方法里面 因为里面的没10ms走一次会重置结果
    /* 获取图片的抽象方法入口 */
    public BufferedImage getImage(){//该方法需要重复不断的执行 设置间隔为10ms一次
        //该方法是根据敌机当前的状态来执行，只有改变状态才能改变结果
        if(isLive()){
            return Images.airs[0];//存活状态返回小敌机的图片
        }else if(isDead()){
            BufferedImage img =Images.airs[index++];//获取爆炸的图片1-3
            if(index == Images.airs.length) {//如果爆炸图片的下标走到了最后一张+1，说明爆炸结束
                state = REMOVE;  //爆炸结束后改成删除状态
            }
            return img;//死亡状态返回爆炸图片
        }
        return null;   //删除状态不返回图片
    }
}
