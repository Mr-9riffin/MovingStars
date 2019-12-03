import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
public class StarAnimation extends Canvas
{
    private int x;
    private int y;
    private Timer timer;
    private static final int SLEEP = 70;  //how long to wait between actions

    public StarAnimation()
    {
        setBackground(Color.BLACK);

        x = 0;
        y = 0;

        ActionListener paintCaller = new ActionListener(){
                public void actionPerformed(ActionEvent event)
                {
                    repaint();  //after SLEEP milliseconds have passed - paint is called
                }
            };
        //how often to act - what to use when acting
        timer = new Timer(SLEEP, paintCaller);
        timer.start();
    }

    public void paint( Graphics window )
    {
        int numStars = 10;
        for(int j = 0; j < 8; j++){
            for (int i = 1; i <= numStars; i++) 
            {
                StarDrawer drawStar = new StarDrawer();
                Color thisColor = new Color(((i+y+j)*100)%255, ((i+y+j)*200)%255, ((i+y+j)*300)%255 );
                drawStar.paintStar(window, thisColor,(i-1)*80 + y,70*j);
            }
        }
        y++;
    }
}
