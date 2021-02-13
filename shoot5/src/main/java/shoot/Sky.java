package shoot;

public class Sky extends FlyingObject{
    private int y1;
    private int speed;

    /* 构造方法 */
    Sky(){
        super(400,700,0,0);
        y1=-height;
        speed =2;
    }

    /* 重写移动方法权限必须大于等于超类的方法 */
    public void step(){
        System.out.println("天空的y和y1向下移动了");
    }
}
