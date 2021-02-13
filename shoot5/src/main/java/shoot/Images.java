package shoot;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/* 图片工具类 */
public class Images {
    public static BufferedImage sky;    //声明一个天空图的变量
    public static BufferedImage bullet; //子弹的图片
    public static BufferedImage[] heros;//英雄机的图片数组
    public static BufferedImage[] airs; //小敌机的图片数组
    public static BufferedImage[] bairs;//大敌机的图片数组
    public static BufferedImage[] bees; //奖励机的图片数组

    /* 静态块 */
    static {//初始化静态块资源，在调用类时，会自动加载(存放在方法区中)他们的初始值一开始都是null和0
        sky = readImage("background.png");
        bullet = readImage("bullet.png");

        heros =new BufferedImage[2];  //英雄机的图片
        heros[0] = readImage("hero0.png");
        heros[1] = readImage("hero0.png");

        airs = new BufferedImage[5];//每种敌人都有5种状态
        bairs =new BufferedImage[5];
        bees =new BufferedImage[5];
        airs[0] =readImage("airplane.png");
        bairs[0] =readImage("bigairplane.png");
        bees[0] =readImage("bee.png");
        for(int i=1;i<airs.length;i++){
            airs[i] =readImage("bom"+i+".png");
            bairs[i] =readImage("bom"+i+".png");
            bees[i] =readImage("bom"+i+".png");
        }
    }

    /* 读取图片的方法 */
    public static BufferedImage readImage(String fileName){
        try{
            BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
            return img;
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
