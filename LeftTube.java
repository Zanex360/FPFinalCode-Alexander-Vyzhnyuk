import java.awt.Graphics2D;

public class LeftTube extends Sprite{
    public LeftTube(double x, double y, double w, double h){
        super(x, y, w, h);
    }

    public void render(Graphics2D g) {
        g.drawImage(Game.lefttubeSprite, (int) x, (int) y, (int) w, (int) h, null);
    }
}
