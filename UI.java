import java.awt.Graphics2D;

public abstract class UI {
    protected double x;
    protected double y;
    protected double w;
    protected double h;

    public UI(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void render(Graphics2D g) {

    }

    public void update(double dt) {

    }
}