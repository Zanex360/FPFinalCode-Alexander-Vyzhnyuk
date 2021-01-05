import java.awt.Graphics2D;

public abstract class Sprite {
   protected double x;
   protected double y;
   protected double w;
   protected double h;

   public Sprite(double x, double y, double w, double h) {
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
   }

   public void render(Graphics2D g) {
      g.fillRect(
         (int) x, 
         (int) y, 
         (int) w, 
         (int) h
      );
   }

   public void update(double dt) {
      
   }

   public void collision(Sprite s) {

   }
}
