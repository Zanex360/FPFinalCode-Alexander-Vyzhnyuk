import java.awt.Graphics2D;

public class Block extends Sprite {
    public Block(double x, double y, double w, double h){
        super(x, y, w, h);
    }

    public void render(Graphics2D g) {
        g.drawImage(Game.blockSprite, (int) x, (int) y, (int) w, (int) h, null);
    }
}