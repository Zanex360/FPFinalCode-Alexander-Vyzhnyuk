import java.awt.Graphics2D;

public class Mystery extends Sprite{
    public Mystery(double x, double y) {
        super(x, y, 30, 30);
    }

    public void render(Graphics2D g) {
        g.drawImage(Game.mysterySprite, (int) x, (int) y, (int) w, (int) h, null);
    }

    public void collision(Sprite other) {
        if (other instanceof Player) {
            Game.removeSprite(this);
            Game.addSprite(new Block(this.x, this.y, this.w, this.h));
            Game.addSprite(new Coin(this.x, this.y - 30, this.w, this.h));
        }
    }
}