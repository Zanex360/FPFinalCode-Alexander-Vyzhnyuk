import java.awt.Frame;
import java.awt.image.BufferStrategy;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.lang.reflect.Array;
import java.io.File;
import java.awt.image.BufferedImage;

public class Game {
    public static BufferedImage coinSprite;
    public static BufferedImage playerSprite;
    public static BufferedImage blockSprite;
    public static BufferedImage mysterySprite;

    private static ArrayList<Sprite> level = new ArrayList<Sprite>();
    private static ArrayList<UI> ui = new ArrayList<UI>();

    public static void main(String[] args) {
        try {
            coinSprite = ImageIO.read(new File("Sprites/Coin.png"));
            blockSprite = ImageIO.read(new File("Sprites/Block.png"));
            playerSprite = ImageIO.read(new File("Sprites/Player.png"));
            mysterySprite = ImageIO.read(new File("Sprites/Mystery.png"));
        }
        catch (IOException e) {
            System.out.println(e);
        }

        Frame a = new Frame();
        a.setSize(1000, 700);
        a.setVisible(true);
        a.createBufferStrategy(2);
        BufferStrategy strat = a.getBufferStrategy();
        Player player = new Player(120, 450, 30, 30);
        UI counter = new CoinCounter(100, 100, 30, 30, player);
        UI lifetime = new Timer(460, 50, 30, 30, player);
        level.add(player);
        level.add(new Block(100, 500, 30, 30));
        level.add(new Block(130, 500, 30, 30));
        level.add(new Block(160, 500, 30, 30));
        level.add(new Block(190, 500, 30, 30));
        level.add(new Block(220, 500, 30, 30));
        level.add(new Block(250, 500, 30, 30));
        level.add(new Block(280, 500, 30, 30));
        level.add(new Block(310, 500, 30, 30));

        //coin thing
        level.add(new Block(310, 410, 30, 30));
        level.add(new Mystery(340, 410));
        level.add(new Block(370, 410, 30, 30));

        level.add(new Mystery(550, 410));
        level.add(new Mystery(580, 410));
        level.add(new Mystery(520, 450));

        level.add(new Block(340, 500, 30, 30));
        level.add(new Block(370, 500, 30, 30));
        level.add(new Block(400, 500, 30, 30));
        level.add(new Block(430, 500, 30, 30));
        level.add(new Block(460, 500, 30, 30));
        level.add(new Block(490, 500, 30, 30));
        level.add(new Block(520, 500, 30, 30));
        level.add(new Block(550, 500, 30, 30));
        level.add(new Block(580, 500, 30, 30));
        level.add(new Block(610, 500, 30, 30));
        level.add(new Block(640, 500, 30, 30));
        level.add(new Block(670, 500, 30, 30));
        level.add(new Block(700, 500, 30, 30));
        level.add(new Block(730, 500, 30, 30));
        level.add(new Block(730, 470, 30, 30));
        level.add(new Block(760, 500, 30, 30));
        level.add(new Block(760, 470, 30, 30));
        level.add(new Block(760, 440, 30, 30));
        level.add(new Block(850, 500, 30, 30));
        level.add(new Block(880, 500, 30, 30));
        level.add(new Block(910, 500, 30, 30));
        level.add(new Block(940, 500, 30, 30));
        level.add(new Block(970, 500, 30, 30));
        level.add(new Block(1060, 500, 30, 30));

        long delta = System.currentTimeMillis();
        long timer = System.currentTimeMillis();
        
        while (true) {
            delta = System.currentTimeMillis() - timer;
            timer = System.currentTimeMillis();

            //handle collision
            for (int i = 0; i < level.size(); i += 1) {
                for (int j = i + 1; j < level.size(); j += 1) {
                    Sprite lhs = level.get(i);
                    Sprite rhs = level.get(j);

                    if (
                        lhs.x < rhs.x + rhs.w && 
                        lhs.x + lhs.w > rhs.x &&
                        lhs.y < rhs.y + rhs.h &&
                        lhs.y + lhs.h > rhs.y
                    ) {
                        lhs.collision(rhs);
                        rhs.collision(lhs);
                    }
                }
            }

            //update
            for (Sprite sprite : level) {
                sprite.update(delta / 1000.0);
            }

            //camera
            double cameraX = 0;
            double cameraY = 0;

            for (Sprite sprite : level) {
                if (sprite instanceof Player) {
                    cameraX = -sprite.x + 500;
                    cameraY = -100;
                    break;
                }
            }

            //draw or render
            Graphics g = strat.getDrawGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1000, 700);
            g.translate((int) cameraX, (int) cameraY);
            for (Sprite sprite : level) {
                sprite.render((Graphics2D) g);
            }

            g.translate((int) -cameraX, (int) -cameraY);
            counter.render((Graphics2D) g);
            lifetime.render((Graphics2D) g);
            //render the rest of the ui elements
            g.dispose();
            strat.show();
        }
    }

    public static void removeSprite(Sprite sprite) {
        level.remove(sprite);
    }
    
    public static void addSprite(Sprite sprite) {
        level.add(sprite);
    }
}