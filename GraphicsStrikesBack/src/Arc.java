import java.awt.*;

public class Arc implements Sprite
{
    private int width,height,startAngle,arcAngle;
    private Color color;
    public Arc(int width,int height,int startAngle,int arcAngle,Color color)
    {
        this.width=width;
        this.height=height;
        this.startAngle=startAngle;
        this.arcAngle=arcAngle;
        this.color=color;
    }
    public void draw(Graphics surface,int x,int y)
    {
        surface.setColor(color);
        surface.fillArc(x, y, width, height,startAngle,arcAngle);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawArc(x, y, width, height,startAngle,arcAngle);
    }
    public int getWidth()
    {
        return this.width;
    }
    public int getHeight()
    {
        return this.height;
    }
}
