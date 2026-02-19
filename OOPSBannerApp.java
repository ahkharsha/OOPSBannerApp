/**
 * OOPSBannerApp UC5 – OOPS Banner Display Application
 * 
 * This application uses inline initialization to store the OOPS banner lines in an array and prints them using a loop.
 * 
 * @author Developer
 * @version 5.0
 */

class OOPSBannerApp {
    // Main method to run the application
	public static void main(String args[]) {

        // Define and populate the array in one concise step using inline initialization
        String[] lines={
            String.join(" ","  *****  ","  *****  ","******** ","  ****** "),
		    String.join(" "," **   ** "," **   ** ","**     **"," **    **"),
		    String.join(" ","**     **","**     **","**     **","**       "),
		    String.join(" ","**     **","**     **","******** "," ******* "),
		    String.join(" ","**     **","**     **","**       ","       **"),
		    String.join(" "," **   ** "," **   ** ","**       ","**    ** "),
		    String.join(" ","  *****  ","  *****  ","**       "," ******  ")
        };

        // Use a loop to print each line from the array
        for (String line: lines) {
            System.out.println(line);
        }
	}
}