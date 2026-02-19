/**
 * OOPSBannerApp UC6 – OOPS Banner Display Application
 * 
 * This application displays the OOPS banner by using separate functions to generate the pattern for each letter.
 * 
 * @author Developer
 * @version 6.0
 */

public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "******** ",
            "**     **",
            "**     **",
            "******** ",
            "**       ",
            "**       ",
            "**       "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  ****** ",
            " **    **",
            "**       ",
            " ******* ",
            "       **",
            "**    ** ",
            " ******  "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare String Arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use a loop to Assemble each line of the banner to create the visual effect for the message "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}