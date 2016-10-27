package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {
	
	private static Scanner s;

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		s = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = s.next();
				
//				String[] relPathParts = relPath.split(File.separator);
//				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				
				imagePath = (dir + "\\" + relPath); //see piazza 10/12/16 "Javagram not working for me" comment - ES 10/24/16
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		// TODO - prompt user for filter and validate input
		
		
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		Filter filter = getFilter();		

		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = s.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		s.close();
	}
	
	private static BlueFilter getBlueFilter() {

		return new BlueFilter();	
	}
	
	private static RedFilter getRedFilter() {
		return new RedFilter();
	}
	
	public static Filter getFilter()
	{
		System.out.println("Choose a filter!");
		System.out.println("1. Blue.");
		System.out.println("2. Red.");
		System.out.println("3. Exit program.");
		int selection = s.nextInt(); //calling scanner to use the next integer method; if user puts in a non integer higher than x (6 here), this will fail :(

		while(selection < 0 || selection > 4)
		{
			System.out.println("Invalid selection, please try agains:");
			selection =  s.nextInt();
		}
		Filter f = null;
		if (selection == 1) {
			f = getBlueFilter();
		}
		else if (selection == 2){
			f = getRedFilter();
		}
		else {
			System.exit(0);
		}
		return f;
	}

}