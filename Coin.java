import java.awt.Graphics2D;

public class Coin extends Sprite {
    private double poptimer;
    private double final_y;

    public Coin(double x, double y, double w, double h) {
        super(x, y, w, h);
        this.poptimer = 1;
        this.final_y = y;
    }
    
    public void render(Graphics2D g) {
        g.drawImage(Game.coinSprite, (int) x, (int) y, (int) w, (int) h, null);
    }

    public void update(double dt) {
        if (poptimer > 0) {
            poptimer -= dt;
        }
        else {
            poptimer = 0;
        }
        y = final_y - (-4 * Math.pow(poptimer - 0.5, 2) + 1) * 10;
    }
}
// coins move while on ground and player can pick up coins