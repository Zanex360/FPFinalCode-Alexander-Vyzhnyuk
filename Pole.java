import java.awt.Graphics2D;

public class Pole extends Sprite{
    public Pole(double x, double y, double w, double h){
        super(x, y, w, h);
    }

    public void render(Graphics2D g) {
        g.drawImage(Game.poleSprite, (int) x, (int) y, (int) w, (int) h, null);
    }
}
