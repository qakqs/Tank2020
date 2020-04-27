import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author 12480
 */
public class TankFrame extends Frame {
    Tank myTank;
    public TankFrame(){
        this.setTitle("Tank war");
        this.setLocation(400, 100);
        this.setSize(800, 600);
        this.addKeyListener(new TankKeyListenr());
        myTank = new Tank(100, 100);
    }

    public class TankKeyListenr extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            myTank.keyPresed(e);

        }

        @Override
        public void keyReleased(KeyEvent e) {
            myTank.KeyReleased(e);
        }
    }


    //paint自动调用
    @Override
    public void paint(Graphics g) {
        myTank.paint(g);
    }



}
