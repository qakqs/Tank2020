import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * @author 12480
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();
        tf.setVisible(true);
        for(;;){
            TimeUnit.MICROSECONDS.sleep(10000);
            //repaint 内部会调用paint方法
            tf.repaint();
        }
    }
}
