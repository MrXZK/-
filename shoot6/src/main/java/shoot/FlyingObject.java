package shoot;
import java.awt.image.BufferedImage;
import java.util.Random;

public abstract class FlyingObject {
    public static final int LIVE =0; //活着状态
    public static final int DEAD =1; //死亡状态
    public static final int REMOVE =2;//删除状态
    protected int state =LIVE;        //当前状态

    protected int width;  //宽  受保护的，不能私有 因为子类要继承
    protected int height; //高
    protected int x;
    protected int y;

    /* 敌机的构造方法 */
    public FlyingObject(int width,int height){
        this.width  = width;
        this.height = height;
        Random rand = new Random();
        x = rand.nextInt(Word.WIDTH-width);
        y = -height;
    }

    /* 英雄机和天空子弹的构造方法 */
    public FlyingObject(int width,int height,int x,int y){
        this.width  = width;
        this.height = height;
        this.x=x;
        this.y=y;
    }

    /* 派生类移动方法的入口 */
    public abstract void step();

    /* 获取图片的抽象方法入口 */
    public abstract BufferedImage getImage();

    /* 判断当前存活状态 */
    public boolean isLive(){
        return state == DEAD;//当前状态为LIVE，表示为活着的，返回为ture
    }

    /* 判断当前存活状态 */
    public boolean isDead(){
        return state == DEAD; //当前状态为DEAD，则表示死亡
    }

    /* 判断当前存活状态 */
    public boolean isRemove (){
        return state == REMOVE;//当前状态为REMOVE，则表示删除
    }
}
