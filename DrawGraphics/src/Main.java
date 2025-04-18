import java.awt.Color;
import java.awt.Graphics;

class DrawGraphics {
    BouncingBox box;

    /** Initializes this class for drawing. */
    public DrawGraphics()
    {
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(10,10);
    }

    public void draw(Graphics surface) {
        /** Draw the contents of the window on surface. Called 20 times per second. */
        surface.drawLine(50, 50, 250, 250);
        surface.drawRect(30,30,50,50);
        surface.drawArc(100,100,50,50,100,100);
        box.draw(surface);
    }
}