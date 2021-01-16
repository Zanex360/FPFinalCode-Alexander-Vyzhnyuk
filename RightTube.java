import java.awt.Graphics2D;

public class RightTube extends Sprite{
    public RightTube(double x, double y, double w, double h){
        super(x, y, w, h);
    }

    public void render(Graphics2D g) {
        g.drawImage(Game.righttubeSprite, (int) x, (int) y, (int) w, (int) h, null);
    }
}
