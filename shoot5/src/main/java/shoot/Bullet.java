package shoot;

public class Bullet extends FlyingObject{
    private int speed;

    /* 构造方法 */
    Bullet(int width,int eight,int x,int y){
        super(8,20,x,y);
        speed =3;
    }

    /* 重写移动方法权限必须大于等于超类的方法 */
    public void step(){
        System.out.println("子弹的y向上移动了");
    }
}
