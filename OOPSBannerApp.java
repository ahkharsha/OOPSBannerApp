/**
 * OOPSBannerApp UC3 – OOPS Banner Display Application
 * 
 * This application prints the OOPS banner using String.join to combine text parts efficiently.
 * 
 * @author Developer
 * @version 3.0
 */

class OOPSBannerApp {
    // Main method to run the application
	public static void main(String args[]) {

        // Print the OOPS banner using String.join for efficient text combination
		System.out.println(String.join(" ","  *****  ","  *****  ","******** ","  ****** "));
		System.out.println(String.join(" "," **   ** "," **   ** ","**     **"," **    **"));
		System.out.println(String.join(" ","**     **","**     **","**     **","**       "));
		System.out.println(String.join(" ","**     **","**     **","******** "," ******* "));
		System.out.println(String.join(" ","**     **","**     **","**       ","       **"));
		System.out.println(String.join(" "," **   ** "," **   ** ","**       ","**    ** "));
		System.out.println(String.join(" ","  *****  ","  *****  ","**       "," ******  "));
	}
}