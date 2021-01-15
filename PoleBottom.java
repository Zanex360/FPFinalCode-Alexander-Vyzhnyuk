import java.awt.Graphics2D;

public class PoleBottom extends Sprite{
    public PoleBottom(double x, double y, double w, double h){
        super(x, y, w, h);
    }

    public void render(Graphics2D g) {
        g.drawImage(Game.polebottomSprite, (int) x, (int) y, (int) w, (int) h, null);
    }
}
