package controller;

import javax.swing.JFrame;
import model.GameData;
import view.GamePanel;
import view.MainWindow;

/**
 * 
 * @version 1.1
 */
public class Main {

    public static GamePanel gamePanel;
    public static GameData gameData;
    public static Animator animator;

    public static int WIN_WIDTH = 700;
    public static int WIN_HEIGHT = 500;

    public static void main(String[] args) {
           
        
        animator = new Animator();
        gameData = new GameData();
        gamePanel = new GamePanel();
        
        JFrame game = new MainWindow();
        game.setTitle("p8 Olabisi Kadri");
        game.setSize(WIN_WIDTH, WIN_HEIGHT);
        game.setLocation(100, 0);
        game.setResizable(false); // window size cannot change
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);

        // start animation
        new Thread(animator).start();
        
    }
}
