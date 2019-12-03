//(c) A+ Computer Science
// www.apluscompsci.com



import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Canvas;

public class StarDrawer
{
	public void paintStar( Graphics window, Color starColor, int xPos, int yPos )
	{
		
		int[] xPoints = {xPos,xPos + 30,xPos + 40,xPos+50,xPos+80,xPos+60,xPos+70,xPos+40,xPos+10,xPos+20};
		int[] yPoints = {yPos,yPos,yPos-30,yPos,yPos,yPos+15,yPos+45,yPos+30,yPos+45,yPos+15};
		int nPoints = 10;
		Polygon star = new Polygon(xPoints,yPoints,nPoints);
		
		window.setColor(starColor);
		window.fillPolygon(star);
	}
}