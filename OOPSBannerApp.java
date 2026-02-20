/**
 * OOPSBannerApp UC8 – OOPS Banner Display Application
 *
 * This application uses a HashMap to store patterns for efficient lookup and displays the OOPS banner.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.HashMap;

public class OOPSBannerApp {

    /**
     * Creates a Map to hold the patterns for O, P, and S.
     * * @return A HashMap linking characters to their string patterns
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Add pattern for O
        charMap.put('O', new String[] {
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        });

        // Add pattern for P
        charMap.put('P', new String[] {
            "******** ",
            "**     **",
            "**     **",
            "******** ",
            "**       ",
            "**       ",
            "**       "
        });

        // Add pattern for S
        charMap.put('S', new String[] {
            "  ****** ",
            " **    **",
            "**       ",
            " ******* ",
            "       **",
            "**    ** ",
            " ******  "
        });

        return charMap;
    }

    /**
     * Prints the banner by joining the patterns line by line.
     * @param message The text to display
     * @param charMap The map containing patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = 7;

        // Loop through each line of the pattern
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            
            // Build the current line by getting patterns from the map
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    // Main entry point of the application.
    public static void main(String[] args) {
        // Create the map and define the message
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        
        // Display the final banner
        displayBanner(message, charMap);
    }
}