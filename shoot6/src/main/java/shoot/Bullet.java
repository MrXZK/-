package shoot;

import java.awt.image.BufferedImage;

public class Bullet extends FlyingObject{
    private int speed;

    /* 构造方法 */
    Bullet(int x,int y){
        super(8,20,x,y);
        speed =3;
    }

    /* 重写移动方法权限必须大于等于超类的方法 */
    public void step(){
        System.out.println("子弹的y向上移动了");
    }

    /* 获取图片的抽象方法入口 */
    public BufferedImage getImage(){//该方法需要重复不断的执行 设置间隔为10ms一次
        //子弹的状态有两种状态，需要先判断子弹的状态在获取图片
        if(isLive()){ //若状态为存活时，则返回子弹图片
            return Images.bullet;
        }else if(isDead()){//若子弹为死亡时，先把状态更改为要删除状态，在返回空图片
            state = REMOVE;
        }
        return null;
    }
}
