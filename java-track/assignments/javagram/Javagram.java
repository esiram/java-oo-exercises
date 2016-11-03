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
		String imagePath = "path not set";
		
		// prompt user for image to filter and validate input
		do {
			try {
				System.out.println("Image path (relative to " + dir + "):");
				relPath = s.next();
				imagePath = (dir + "\\" + relPath); //see piazza 10/12/16 "Javagram not working for me" comment - ES 10/24/16
				picture = new Picture(imagePath);			
			} 		
			catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
		} while(picture == null);
		
		Filter filter = null;
		do {
			try{
			       filter = getFilter();	
				}
				catch(IllegalArgumentException e) {
					System.out.println("Exception thrown:" + e);
				}
		} while(filter == null);
		
		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = s.next();
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		}
		else {
			String absFileName = dir + "\\" + fileName;
			while (absFileName.equals(imagePath)){
				System.out.println("Saving with this name will overide the original image. Yes Or No?");
				String selection = s.next();
				if (selection.equals("Yes") || selection.equals("yes") || selection.equals("YES") || selection.equals("Y")){
					break;
				}
				else{ // !=yes
					System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
					String newfileName = s.next();
					absFileName = dir + File.separator + newfileName;
				}
			}
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
			
		// close input scanner
		s.close();
		}
	}

	public static Filter getFilter()
	{
		System.out.println("Choose a filter!");
		System.out.println("1. Blue.");
		System.out.println("2. Red.");
		System.out.println("3. Green.");
		System.out.println("4. Gray.");
		//System.out.println("5. Flip."); //this flip not working as of 10/27/16

		//calling scanner to use the next integer method; failure if user submits a non-integer higher than x (4 here)

		int selection = s.nextInt(); 
		if (selection < 0 || selection > 5) {
			throw new IllegalArgumentException("Invalid selection, please try again.");
		}
		Filter f = null;
		if (selection == 1) {
			f = new BlueFilter();
		}
		else if (selection == 2){
			f = new RedFilter();
		}
		else if (selection == 3){
			f = new GreenFilter();
		}
		else{// if (selection == 4)
			f = new GrayFilter();
		}
//		else{ // if (selection == 5)
//			f = new FlipFilter();
//		}
		return f;
	}
}