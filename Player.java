import java.awt.Graphics2D;

public class Player extends Sprite {
    private double dy;
    private double ddy;
    private boolean grounded;
    private int coins;
    private double lifetime;

    public Player(double x, double y, double w, double h) {
        super(x, y, w, h);
        this.dy = 0;
        this.ddy = 100;
        this.grounded = false;
        this.coins = 0;
    }

    public void render(Graphics2D g) {
        g.drawImage(Game.playerSprite, (int) x, (int) y, (int) w, (int) h, null);
    }

    public void update(double dt) {
        lifetime += dt;

        if (Input.getWDown() && grounded) {
            dy = -90;
            grounded = false;
        }

        if (Input.getADown()) {
            x -= 100 * dt;
        }

        if (Input.getSDown()) {
            y += 100 * dt;
        }

        if (Input.getDDown()) {
            x += 100 * dt;
        }

        if (!grounded) {
            dy += ddy * dt;
            y += dy * dt;
        }
        grounded = false;
    }

    public void collision(Sprite other) {
        if (other instanceof Block) {
            if (y + h > other.y && y < other.y) {
                grounded = true;
                y = other.y - h;
                dy = 0;
            }

            //if (x + w > other.x && y > other.y + other.h) {
            //    x = other.x - w;
            //}
           //if (y > other.y + other.h) {
            //    y = other.y + other.h;
           //}
            //else if (y < other.y + other.h) {
            //    y = other.y + h;
            //    dy = 0;
            //}

            //from left
            if (x < other.x + other.w && y + h / 2 < other.y + other.h && y + h / 2 > other.y) {
                x = other.x + other.w;
            }
            //from right
            if (x + w > other.x && y + h / 2 < other.y + other.h && y + h / 2 > other.y) {
                x = other.x - w;
            }
            //from top

            //from bottom
        }
        if (other instanceof Coin) {
            Game.removeSprite(other);
            coins += 1;
            System.out.println(coins);
        }
    }
    public int getCoins() {
        return coins;
    }
    public double getLifetime() {
        return lifetime;
    }
}
