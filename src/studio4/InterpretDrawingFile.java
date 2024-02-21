package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		Color pinky = new Color(255, 109, 182);
		StdDraw.setPenColor(pinky);
		StdDraw.filledRectangle(0.5, 0.5, .2, .2);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(0.5, 0.5, 0.2);
		Color yellow = new Color(255, 221, 90);
		StdDraw.setPenColor(yellow);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		
		
		
		
	}
}
