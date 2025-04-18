import java.awt.*;

public interface Mover {
//    int x,y,xDirection,yDirection;
//    Sprite sprite;
    void setMovementVector(int xIncrement, int yIncrement);
    void draw(Graphics graphics);

}
