import java.awt.Color;
import java.awt.Graphics2D;

public class CoinCounter extends UI{
    
    private int value = 0;
    private Player player;

    public CoinCounter(double x, double y, double w, double h, Player player) {
        super(x, y, w, h);
        this.player = player;
    }
    public void render(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.drawString(Integer.toString(player.getCoins()), 50, 50);
    }
}
