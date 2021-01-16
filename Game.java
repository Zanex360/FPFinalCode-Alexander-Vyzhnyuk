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
    public static BufferedImage polebottomSprite;
    public static BufferedImage poleSprite;
    public static BufferedImage lefttubeSprite;
    public static BufferedImage righttubeSprite;

    private static ArrayList<Sprite> level = new ArrayList<Sprite>();
    private static ArrayList<UI> ui = new ArrayList<UI>();

    public static void main(String[] args) {
        try {
            coinSprite = ImageIO.read(new File("Sprites/Coin.png"));
            blockSprite = ImageIO.read(new File("Sprites/Block.png"));
            playerSprite = ImageIO.read(new File("Sprites/Player.png"));
            mysterySprite = ImageIO.read(new File("Sprites/Mystery.png"));
            polebottomSprite = ImageIO.read(new File("Sprites/PoleBottom.png"));
            poleSprite = ImageIO.read(new File("Sprites/Pole.png"));
            lefttubeSprite = ImageIO.read(new File("Sprites/LeftTube.png"));
            righttubeSprite = ImageIO.read(new File("Sprites/RightTube.png"));
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
        level.add(new Block(-380, 500, 30, 30));
        level.add(new Block(-350, 500, 30, 30));
        level.add(new Block(-320, 500, 30, 30));
        level.add(new Block(-290, 500, 30, 30));
        level.add(new Block(-260, 500, 30, 30));
        level.add(new Block(-230, 500, 30, 30));
        level.add(new Block(-200, 500, 30, 30));
        level.add(new Block(-170, 500, 30, 30));
        level.add(new Block(-140, 500, 30, 30));
        level.add(new Block(-110, 500, 30, 30));
        level.add(new Block(-80, 500, 30, 30));
        level.add(new Block(-50, 500, 30, 30));
        level.add(new Block(-20, 500, 30, 30));
        level.add(new Block(10, 500, 30, 30));
        level.add(new Block(40, 500, 30, 30));
        level.add(new Block(70, 500, 30, 30));
        level.add(new Block(100, 500, 30, 30));
        level.add(new Block(130, 500, 30, 30));
        level.add(new Block(160, 500, 30, 30));
        level.add(new Block(190, 500, 30, 30));
        level.add(new Block(220, 500, 30, 30));
        level.add(new Block(250, 500, 30, 30));
        level.add(new Block(280, 500, 30, 30));
        level.add(new Block(310, 500, 30, 30));
        level.add(new Block(-380, 530, 30, 30));
        level.add(new Block(-350, 530, 30, 30));
        level.add(new Block(-320, 530, 30, 30));
        level.add(new Block(-290, 530, 30, 30));
        level.add(new Block(-260, 530, 30, 30));
        level.add(new Block(-230, 530, 30, 30));
        level.add(new Block(-200, 530, 30, 30));
        level.add(new Block(-170, 530, 30, 30));
        level.add(new Block(-140, 530, 30, 30));
        level.add(new Block(-110, 530, 30, 30));
        level.add(new Block(-80, 530, 30, 30));
        level.add(new Block(-50, 530, 30, 30));
        level.add(new Block(-20, 530, 30, 30));
        level.add(new Block(10, 530, 30, 30));
        level.add(new Block(40, 530, 30, 30));
        level.add(new Block(70, 530, 30, 30));
        level.add(new Block(100, 530, 30, 30));
        level.add(new Block(130, 530, 30, 30));
        level.add(new Block(160, 530, 30, 30));
        level.add(new Block(190, 530, 30, 30));
        level.add(new Block(220, 530, 30, 30));
        level.add(new Block(250, 530, 30, 30));
        level.add(new Block(280, 530, 30, 30));
        level.add(new Block(310, 530, 30, 30));
        level.add(new Block(-380, 560, 30, 30));
        level.add(new Block(-350, 560, 30, 30));
        level.add(new Block(-320, 560, 30, 30));
        level.add(new Block(-290, 560, 30, 30));
        level.add(new Block(-260, 560, 30, 30));
        level.add(new Block(-230, 560, 30, 30));
        level.add(new Block(-200, 560, 30, 30));
        level.add(new Block(-170, 560, 30, 30));
        level.add(new Block(-140, 560, 30, 30));
        level.add(new Block(-110, 560, 30, 30));
        level.add(new Block(-80, 560, 30, 30));
        level.add(new Block(-50, 560, 30, 30));
        level.add(new Block(-20, 560, 30, 30));
        level.add(new Block(10, 560, 30, 30));
        level.add(new Block(40, 560, 30, 30));
        level.add(new Block(70, 560, 30, 30));
        level.add(new Block(100, 560, 30, 30));
        level.add(new Block(130, 560, 30, 30));
        level.add(new Block(160, 560, 30, 30));
        level.add(new Block(190, 560, 30, 30));
        level.add(new Block(220, 560, 30, 30));
        level.add(new Block(250, 560, 30, 30));
        level.add(new Block(280, 560, 30, 30));
        level.add(new Block(310, 560, 30, 30));
        level.add(new Block(-380, 590, 30, 30));
        level.add(new Block(-350, 590, 30, 30));
        level.add(new Block(-320, 590, 30, 30));
        level.add(new Block(-290, 590, 30, 30));
        level.add(new Block(-260, 590, 30, 30));
        level.add(new Block(-230, 590, 30, 30));
        level.add(new Block(-200, 590, 30, 30));
        level.add(new Block(-170, 590, 30, 30));
        level.add(new Block(-140, 590, 30, 30));
        level.add(new Block(-110, 590, 30, 30));
        level.add(new Block(-80, 590, 30, 30));
        level.add(new Block(-50, 590, 30, 30));
        level.add(new Block(-20, 590, 30, 30));
        level.add(new Block(10, 590, 30, 30));
        level.add(new Block(40, 590, 30, 30));
        level.add(new Block(70, 590, 30, 30));
        level.add(new Block(100, 590, 30, 30));
        level.add(new Block(130, 590, 30, 30));
        level.add(new Block(160, 590, 30, 30));
        level.add(new Block(190, 590, 30, 30));
        level.add(new Block(220, 590, 30, 30));
        level.add(new Block(250, 590, 30, 30));
        level.add(new Block(280, 590, 30, 30));
        level.add(new Block(310, 590, 30, 30));
        level.add(new Block(-380, 620, 30, 30));
        level.add(new Block(-350, 620, 30, 30));
        level.add(new Block(-320, 620, 30, 30));
        level.add(new Block(-290, 620, 30, 30));
        level.add(new Block(-260, 620, 30, 30));
        level.add(new Block(-230, 620, 30, 30));
        level.add(new Block(-200, 620, 30, 30));
        level.add(new Block(-170, 620, 30, 30));
        level.add(new Block(-140, 620, 30, 30));
        level.add(new Block(-110, 620, 30, 30));
        level.add(new Block(-80, 620, 30, 30));
        level.add(new Block(-50, 620, 30, 30));
        level.add(new Block(-20, 620, 30, 30));
        level.add(new Block(10, 620, 30, 30));
        level.add(new Block(40, 620, 30, 30));
        level.add(new Block(70, 620, 30, 30));
        level.add(new Block(100, 620, 30, 30));
        level.add(new Block(130, 620, 30, 30));
        level.add(new Block(160, 620, 30, 30));
        level.add(new Block(190, 620, 30, 30));
        level.add(new Block(220, 620, 30, 30));
        level.add(new Block(250, 620, 30, 30));
        level.add(new Block(280, 620, 30, 30));
        level.add(new Block(310, 620, 30, 30));
        level.add(new Block(-380, 650, 30, 30));
        level.add(new Block(-350, 650, 30, 30));
        level.add(new Block(-320, 650, 30, 30));
        level.add(new Block(-290, 650, 30, 30));
        level.add(new Block(-260, 650, 30, 30));
        level.add(new Block(-230, 650, 30, 30));
        level.add(new Block(-200, 650, 30, 30));
        level.add(new Block(-170, 650, 30, 30));
        level.add(new Block(-140, 650, 30, 30));
        level.add(new Block(-110, 650, 30, 30));
        level.add(new Block(-80, 650, 30, 30));
        level.add(new Block(-50, 650, 30, 30));
        level.add(new Block(-20, 650, 30, 30));
        level.add(new Block(10, 650, 30, 30));
        level.add(new Block(40, 650, 30, 30));
        level.add(new Block(70, 650, 30, 30));
        level.add(new Block(100, 650, 30, 30));
        level.add(new Block(130, 650, 30, 30));
        level.add(new Block(160, 650, 30, 30));
        level.add(new Block(190, 650, 30, 30));
        level.add(new Block(220, 650, 30, 30));
        level.add(new Block(250, 650, 30, 30));
        level.add(new Block(280, 650, 30, 30));
        level.add(new Block(310, 650, 30, 30));
        level.add(new Block(-380, 680, 30, 30));
        level.add(new Block(-350, 680, 30, 30));
        level.add(new Block(-320, 680, 30, 30));
        level.add(new Block(-290, 680, 30, 30));
        level.add(new Block(-260, 680, 30, 30));
        level.add(new Block(-230, 680, 30, 30));
        level.add(new Block(-200, 680, 30, 30));
        level.add(new Block(-170, 680, 30, 30));
        level.add(new Block(-140, 680, 30, 30));
        level.add(new Block(-110, 680, 30, 30));
        level.add(new Block(-80, 680, 30, 30));
        level.add(new Block(-50, 680, 30, 30));
        level.add(new Block(-20, 680, 30, 30));
        level.add(new Block(10, 680, 30, 30));
        level.add(new Block(40, 680, 30, 30));
        level.add(new Block(70, 680, 30, 30));
        level.add(new Block(100, 680, 30, 30));
        level.add(new Block(130, 680, 30, 30));
        level.add(new Block(160, 680, 30, 30));
        level.add(new Block(190, 680, 30, 30));
        level.add(new Block(220, 680, 30, 30));
        level.add(new Block(250, 680, 30, 30));
        level.add(new Block(280, 680, 30, 30));
        level.add(new Block(310, 680, 30, 30));
        level.add(new Block(-380, 710, 30, 30));
        level.add(new Block(-350, 710, 30, 30));
        level.add(new Block(-320, 710, 30, 30));
        level.add(new Block(-290, 710, 30, 30));
        level.add(new Block(-260, 710, 30, 30));
        level.add(new Block(-230, 710, 30, 30));
        level.add(new Block(-200, 710, 30, 30));
        level.add(new Block(-170, 710, 30, 30));
        level.add(new Block(-140, 710, 30, 30));
        level.add(new Block(-110, 710, 30, 30));
        level.add(new Block(-80, 710, 30, 30));
        level.add(new Block(-50, 710, 30, 30));
        level.add(new Block(-20, 710, 30, 30));
        level.add(new Block(10, 710, 30, 30));
        level.add(new Block(40, 710, 30, 30));
        level.add(new Block(70, 710, 30, 30));
        level.add(new Block(100, 710, 30, 30));
        level.add(new Block(130, 710, 30, 30));
        level.add(new Block(160, 710, 30, 30));
        level.add(new Block(190, 710, 30, 30));
        level.add(new Block(220, 710, 30, 30));
        level.add(new Block(250, 710, 30, 30));
        level.add(new Block(280, 710, 30, 30));
        level.add(new Block(310, 710, 30, 30));
        level.add(new Block(-380, 740, 30, 30));
        level.add(new Block(-350, 740, 30, 30));
        level.add(new Block(-320, 740, 30, 30));
        level.add(new Block(-290, 740, 30, 30));
        level.add(new Block(-260, 740, 30, 30));
        level.add(new Block(-230, 740, 30, 30));
        level.add(new Block(-200, 740, 30, 30));
        level.add(new Block(-170, 740, 30, 30));
        level.add(new Block(-140, 740, 30, 30));
        level.add(new Block(-110, 740, 30, 30));
        level.add(new Block(-80, 740, 30, 30));
        level.add(new Block(-50, 740, 30, 30));
        level.add(new Block(-20, 740, 30, 30));
        level.add(new Block(10, 740, 30, 30));
        level.add(new Block(40, 740, 30, 30));
        level.add(new Block(70, 740, 30, 30));
        level.add(new Block(100, 740, 30, 30));
        level.add(new Block(130, 740, 30, 30));
        level.add(new Block(160, 740, 30, 30));
        level.add(new Block(190, 740, 30, 30));
        level.add(new Block(220, 740, 30, 30));
        level.add(new Block(250, 740, 30, 30));
        level.add(new Block(280, 740, 30, 30));
        level.add(new Block(310, 740, 30, 30));
        level.add(new Block(-380, 770, 30, 30));
        level.add(new Block(-350, 770, 30, 30));
        level.add(new Block(-320, 770, 30, 30));
        level.add(new Block(-290, 770, 30, 30));
        level.add(new Block(-260, 770, 30, 30));
        level.add(new Block(-230, 770, 30, 30));
        level.add(new Block(-200, 770, 30, 30));
        level.add(new Block(-170, 770, 30, 30));
        level.add(new Block(-140, 770, 30, 30));
        level.add(new Block(-110, 770, 30, 30));
        level.add(new Block(-80, 770, 30, 30));
        level.add(new Block(-50, 770, 30, 30));
        level.add(new Block(-20, 770, 30, 30));
        level.add(new Block(10, 770, 30, 30));
        level.add(new Block(40, 770, 30, 30));
        level.add(new Block(70, 770, 30, 30));
        level.add(new Block(100, 770, 30, 30));
        level.add(new Block(130, 770, 30, 30));
        level.add(new Block(160, 770, 30, 30));
        level.add(new Block(190, 770, 30, 30));
        level.add(new Block(220, 770, 30, 30));
        level.add(new Block(250, 770, 30, 30));
        level.add(new Block(280, 770, 30, 30));
        level.add(new Block(310, 770, 30, 30));
        level.add(new Block(340, 530, 30, 30));
        level.add(new Block(370, 530, 30, 30));
        level.add(new Block(400, 530, 30, 30));
        level.add(new Block(430, 530, 30, 30));
        level.add(new Block(460, 530, 30, 30));
        level.add(new Block(490, 530, 30, 30));
        level.add(new Block(520, 530, 30, 30));
        level.add(new Block(550, 530, 30, 30));
        level.add(new Block(580, 530, 30, 30));
        level.add(new Block(610, 530, 30, 30));
        level.add(new Block(640, 530, 30, 30));
        level.add(new Block(670, 530, 30, 30));
        level.add(new Block(700, 530, 30, 30));
        level.add(new Block(730, 530, 30, 30));
        level.add(new Block(760, 530, 30, 30));
        level.add(new Block(-410, 500, 30, 30));
        level.add(new Block(-440, 500, 30, 30));
        level.add(new Block(-410, 530, 30, 30));
        level.add(new Block(-440, 530, 30, 30));
        level.add(new Block(-410, 560, 30, 30));
        level.add(new Block(-440, 560, 30, 30));
        level.add(new Block(-410, 590, 30, 30));
        level.add(new Block(-440, 590, 30, 30));
        level.add(new Block(-410, 620, 30, 30));
        level.add(new Block(-440, 620, 30, 30));
        level.add(new Block(-410, 650, 30, 30));
        level.add(new Block(-440, 650, 30, 30));
        level.add(new Block(-410, 680, 30, 30));
        level.add(new Block(-440, 680, 30, 30));
        level.add(new Block(-410, 710, 30, 30));
        level.add(new Block(-440, 710, 30, 30));
        level.add(new Block(-410, 740, 30, 30));
        level.add(new Block(-440, 740, 30, 30));
        level.add(new Block(-410, 770, 30, 30));
        level.add(new Block(-440, 770, 30, 30));

        level.add(new PoleBottom(300, 300, 30, 30));
        level.add(new Pole(300, 270, 30, 30));
        
        //invisible wall
        level.add(new InvisibleBlock(40, 100, 30, 400));

        //coin thing
        level.add(new Block(310, 430, 30, 30));
        level.add(new Mystery(340, 430));
        level.add(new Block(370, 430, 30, 30));

        level.add(new Mystery(550, 430));
        level.add(new Mystery(580, 430));
        level.add(new Mystery(520, 430));

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
        level.add(new LeftTube(790, 500, 30, 30));
        level.add(new RightTube(820, 500, 30, 30));
        level.add(new Block(790, 530, 30, 30));
        level.add(new Block(820, 530, 30, 30));
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