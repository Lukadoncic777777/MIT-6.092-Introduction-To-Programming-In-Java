import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    Mover[] movingSprite= new Mover[100];
    int cnt;
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        cnt=4;
        Rectangle box1 = new Rectangle(15, 20, Color.RED);
        Rectangle box2 = new Rectangle(50, 30, Color.BLUE);
        Arc box3=new Arc(20,40,100,300,Color.CYAN);
        Arc box4=new Arc(10,30,0,50,Color.MAGENTA);
        movingSprite[1] = new Bouncer(100, 170, box1);
        movingSprite[1].setMovementVector(3, 1);
        movingSprite[2] = new StraightMover(51, 50, box2);
        movingSprite[2].setMovementVector(5, 7);
        movingSprite[3] = new Bouncer(1, 1, box3);
        movingSprite[3].setMovementVector(14, 9);
        movingSprite[4] = new StraightMover(2, 2, box4);
        movingSprite[4].setMovementVector(2, 2);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for(int i=1;i<=cnt;i++)
        {
            movingSprite[i].draw(surface);
        }
    }
}