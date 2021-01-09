import java.awt.Color;
import java.awt.Graphics2D;

public class Timer extends UI{
    
    private Player player;

    public Timer(double x, double y, double w, double h, Player player){
        super(x, y, w, h);
        this.player = player;
    }
    public void render(Graphics2D g){
        g.setColor(Color.BLACK);
        g.drawString(Double.toString(player.getLifetime()), (int) x, (int) y);
    }
}
