/**
 * OOPSBannerApp UC4 – OOPS Banner Display Application
 * 
 * This application stores the banner lines in an array and prints them using a loop.
 * 
 * @author Developer
 * @version 4.0
 */

class OOPSBannerApp {
    // Main method to run the application
	public static void main(String args[]) {
        
        // Define String array to hold banner lines and populate them
        String lines[]=new String[7];
		lines[0]=String.join(" ","  *****  ","  *****  ","******** ","  ****** ");
		lines[1]=String.join(" "," **   ** "," **   ** ","**     **"," **    **");
		lines[2]=String.join(" ","**     **","**     **","**     **","**       ");
		lines[3]=String.join(" ","**     **","**     **","******** "," ******* ");
		lines[4]=String.join(" ","**     **","**     **","**       ","       **");
		lines[5]=String.join(" "," **   ** "," **   ** ","**       ","**    ** ");
		lines[6]=String.join(" ","  *****  ","  *****  ","**       "," ******  ");

        // Use a loop to print each line from the array
        for (String line: lines) {
            System.out.println(line);
        }
	}
}