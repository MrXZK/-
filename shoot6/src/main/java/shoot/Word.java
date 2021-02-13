package shoot;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
/**
 * 在重写方法中  向上造型的方法被调用时，看的是new的对象是谁，就调用谁方法体
 * 在重载方法中  向上造型的方法被调用时，看的是引用类型是谁，就调谁的方法体
 * 向上造型可以扩大范围，小敌机，大敌机扩大变成敌机，当我需要敌人时，调用起来方便
 * 就是说 放松条件
 */
public class Word extends JFrame{
    public static final int WIDTH=400; //窗口的宽
    public static final int HEIGHT =700;//窗口的高

    private Sky s= new Sky();   //天空对象
    private Hero h=new Hero();  //英雄机对象
    private FlyingObject[] enemies= {
            new Airplane(),
            new BigAirplane(),
            new Bee()
    };  //敌人数组对象
    private Bullet[] bt1 ={
            new Bullet(100,200)
    };   //子弹数组对象\

    /* 测试代码 */
    public void action(){

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Word world = new Word();
        frame.add(world);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH,HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        world.action();
    }
}
