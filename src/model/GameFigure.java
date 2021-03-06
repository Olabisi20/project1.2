package model;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
//import java.awt.event.ActionListener;
//import java.util.Random;
//import javax.swing.Timer;

public abstract class GameFigure implements CollisionBox {
      
    // public for a faster access during animation
    public float x;
    public float y;
    public State st;
    public int state;
    public int time;
   // Random r = new Random();
   // Timer timer;

    public GameFigure(float x, float y) {
        this.x = x;
        this.y = y;
      
    }
    
    public static BufferedImage resize(BufferedImage img, int newW, int newH) {
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = dimg.createGraphics();
        g.drawImage(tmp, 0, 0, null);
        g.dispose();
        return dimg;    
    }
    
    public void setState(State state) {
        st = state;
    }
    
    public State getState() {
        return st;
    }

    // how to render on the canvas
    public abstract void render(Graphics2D g);

    // changes per frame
    public abstract void update();

}
