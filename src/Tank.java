import java.awt.*;
import java.awt.event.KeyEvent;

public class Tank {
    private int x, y;
    public static final int SPEED = 1;
    private Dir dir = Dir.STOP;
    private boolean bL, bU, bR, bD;

    public Tank(int x, int y){
        this.x = x;
        this.y = y;
    }

    //判断坦克朝向
    public void keyPresed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_LEFT:
                bL = true;
                break;
            case KeyEvent.VK_UP:
                bU = true;
                break;
            case KeyEvent.VK_RIGHT:
                bR = true;
                break;
            case KeyEvent.VK_DOWN:
                bD = true;
                break;
            default: break;
        }
        setMainDir();
    }

    //按照按下的键判断dir的值
    private void setMainDir() {
        if( !bL && !bU && !bR && !bD){ dir = Dir.STOP; }
        if( bL && !bU && !bR && !bD){ dir = Dir.L; }
        if( !bL && bU && !bR && !bD){ dir = Dir.U; }
        if( !bL && !bU && bR && !bD){ dir = Dir.R; }
        if( !bL && !bU && !bR && bD){ dir = Dir.D; }
    }




    //键盘回弹的值
    public void KeyReleased(KeyEvent e){
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_LEFT:
                bL = false;
                break;
            case KeyEvent.VK_UP:
                bU = false;
                break;
            case KeyEvent.VK_RIGHT:
                bR = false;
                break;
            case KeyEvent.VK_DOWN:
                bD = false;
                break;
            default: break;
        }
        setMainDir();
    }

    //坦克移动
    private void move(){
        switch (dir){
            case L:
                x -= SPEED;
                break;
            case U:
                y -= SPEED;
                break;
            case R:
                x += SPEED;
                break;
            case D:
                y += SPEED;
                break;
            default:break;
        }
    }
    //画出坦克
    public void paint(Graphics g){
        g.fillRect(x, y, 100,100);
        move();
    }
}
