package shoot;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 在重写方法中  向上造型的方法被调用时，看的是new的对象是谁，就调用谁方法体
 * 在重载方法中  向上造型的方法被调用时，看的是引用类型是谁，就调谁的方法体
 * 向上造型可以扩大范围，小敌机，大敌机扩大变成敌机，当我需要敌人时，调用起来方便
 * 就是说 放松条件
 */
public class Word extends JFrame{
    private Sky s= new Sky();   //天空对象
    private Hero h=new Hero();  //英雄机对象
    private FlyingObject[] enemies= {};  //敌人数组对象
    private Bullet[] bt1 ={};   //子弹数组对象\



    /* 测试代码 */
    public void action(){
        enemies = new FlyingObject[5];
        enemies[0] = new Airplane();  //向上造型：敌机是超类中的属性
        enemies[1] = new Airplane();
        enemies[2] = new BigAirplane();
        enemies[3] = new BigAirplane();
        enemies[4] = new BigAirplane();
        for(int i=0;i<enemies.length;i++){
            FlyingObject f = enemies[i];//敌人属性为超类型 所以赋值也要超类型
            System.out.println(f.x+","+f.y);
            f.step();   //每个敌人开始移动
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Word world = new Word();
        frame.add(world);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        world.action();
    }
}
