package shoot;

import java.util.Random;

public class FlyingObject {
    protected int width;  //宽  受保护的，不能私有 因为子类要继承
    protected int height; //高
    protected int x;
    protected int y;

    /* 敌机的构造方法 */
    public FlyingObject(int width,int height){
        this.width  = width;
        this.height = height;
        Random rand = new Random();
        x = rand.nextInt(400-width);
        y = -height;
    }

    /* 英雄机和天空子弹的构造方法 */
    public FlyingObject(int width,int height,int x,int y){
        this.width  = width;
        this.height = height;
        this.x=x;
        this.y=y;
    }


    /* 移动 */
    public void step(){
        System.out.println("移动");
    }
}
