package shoot;

import java.util.Random;

public class Bee extends FlyingObject{
    private int xSpeed;//x移动
    private int ySpeed;//y移动
    private int awardType; //奖励

    /* 构造方法 */
    Bee(){
        super(60,51);
        ySpeed = 2;
        xSpeed = 1;
        Random rand=new Random();
        awardType = rand.nextInt(2);
    }

    /* 重写移动方法权限必须大于等于超类的方法 */
    public void step(){
        System.out.println("奖励机的y向下移动，x左右移动");
    }




}
