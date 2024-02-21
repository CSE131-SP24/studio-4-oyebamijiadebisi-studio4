package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color black = new Color (0, 0, 0);
		StdDraw.filledSquare(0.5, 0.5, 1);
		
		Color cuteGreen = new Color (110, 237, 87);
		StdDraw.setPenColor(cuteGreen);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2);
		
		Color yt = new Color (255, 255, 255);
		StdDraw.setPenColor(yt);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.075);
		
		Color yellow = new Color(255, 221, 90);
		StdDraw.setPenColor(yellow);
		
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		
		StdDraw.setPenColor(black);
		StdDraw.point(0.45, 0.5);
		StdDraw.point(0.55, 0.5);
	}
}